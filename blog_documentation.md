# Blog Documentation

## Blog Directory

All blog files need to be in the /resources/public/blog_posts directory. Aerolyze blog files should be put in the Aerolyze sub directory, and Blue Moon Analytics blog files should be put in the Blue_Moon_Analytics sub directory.


## Blog File Structure

The blog files need to be structured in this specific way: 
Line 1: Title
Line 2: Date
Line 3: Author
Line 4: Thumbnail file path
Lines 5 to n: Tags
Lines n+1 to end: Blog Body

Example:

```
Blog Title Example
2018 5 25
[Author goes here]
./images/blog/example_image.jpeg
Example Tag 1
Example Tag 2
Example Tag 3

[Blog body goes here]
```

## Blog Exporting 

Both blog's information is extracted and combined into two vector of vectors during compilation. They are then added as a def in their respective .cljs files in the /src/cljs/bma_website/blog_info directory. The code for this can be found /src/clj/bma_website/blog.clj This allows the front-end cljs code to access the blog information. This also keeps the site static and an SPA. 


## Compiling The Site

Use this command to compile the website and generate the .cljs blog vectors:

```
lein do clean, run, cljsbuild once min
```

NOTE: The site will need to be recompiled everytime a blog post is added, removed, or editted. 


## The Blog Template

Each blog is set up the same way. A header is on top, a side bar with the most recent posts is on the right side of the page, and the content of the page is on the left side of the page. Re-frame events are set up to determin what content is supposed to be shown. 
