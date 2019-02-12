# Dev Ops Documentation


## Dependencies

1. [secretary](https://github.com/gf3/secretary) 
   Used for front-end routing.
1. [markdown-to-hiccup](https://github.com/mpcarolin/markdown-to-hiccup)
   A library used to convert markdown into a hiccup vector
1. [stasis](https://github.com/magnars/stasis) 
   Used to get blog page routes and export the blog info to the correct directories.
1. [clj-time](https://github.com/clj-time/clj-time)
   Used for all DateTime operations. In specific, clj-time is used to order the blog posts by date.

   
## Compiling the site

Using this command will compile the site and extract the blog information into a .cljs vector:

```
lein do clean, run, cljsbuild once min
```


## Routing

All routes are defined at /src/bma_website/cljs/routes.cljs. Each route is prefixed with "#" and sends out a re-frame event to associate the correct panel to fill the page with. When a user changes pages, an event is triggered that changes the page content and closes the nav bar if it is open. 

The blog routing is slightly more complicated. The blog pages require an index to be shown and the type of blog being shown. So each post is associated with the :blog panel, but the events that are triggered will be specific to each post/main page. Index -1 is used for the main page of each blog, and any index after that is used for specific posts. This is all set up automatically by the "route-blog-pages" function in routes.cljs.


## Templating 

The main page is located at /resources/public/index.html. This file is used for referencing CSS files and initializing the front end of the website. The templating for each page is located at /src/bma_website/cljs/views.cljs. Every page has its own .cljs file with an "html" function to fill the main content of each view. Each page is located in the /src/bma_website/cljs/pages directory.


## Events and Subscriptions 

Here is a list of all the events:

* ::set-active-panel changes the content displayed on the site to correspond with the correct route and view.
* ::show-sub-nav will display the correct sub nav
* ::show-mobile-nav displays the mobile nav when the site is on a smaller screen.
* ::close-nav closes the mobile nav or the main nav depending on which is open.
* ::blog-page determines which blog post to be shown. If id is -1 the main blog pages will display.
* ::blog-type determines which of the two blogs to display.

In order for the .cljs files to know whether or not an event is active, the function needs to have a variable that "subscribes" to an event handler function. The event handlers are located at /src/bma_website/cljs/subs.cljs. Mainly they return the value from a specific key in the re-frame db. 


## The Nav Bar

There are two nav bars that are used for the site. The mobile nav will show up when the screen width is 690px or smaller. The mobile nav will open with a button on the bottom of the screen, and it will close when changing pages and clicking off of the mobile nav. 

The main nav has multiple layers. When a link is clicked that is tied to the :show-sub-nav event, one of the sub navs will show up. If a sub nav has the class "nav_bottom" the links will be stacked vertically, and will show horizontally if the class is not present.

The main nav sub layers are generated in the html function. Each layer takes 3 arguments 
1. The sub nav's id
1. The sub nav's class
1. A map containing links, titles for each button, and the id of any lower level sub navs that are displayed if one of the buttons is clicked.
