(ns bma-website.pages.terms-of-service
  (:require [bma-website.parts.misc :as misc]
           [bma-website.parts.footer :as footer]  ))

(defn html []
  [:div ;; {:class "codrops-bodyBMA"}
   [:span {:id "hs_cos_wrapper_module_151544186792795"
           :class "hs_cos_wrapper hs_cos_wrapper_widget hs_cos_wrapper_type_raw_html"
           :data-hs-cos-general-type "widget"
           :data-hs-cos-type "raw_html"}
    [:header {:class "codrops-header"
              :style {:padding-bottom "2em" :border-bottom "2px solid #316bad"}}
     [:img {:src "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg"
            :alt "blue moon analytics home welcome header"
            :style {:cursor "default" :width "100%" :border-bottom "2px solid #316bad"}}]
     [:br]
     [:h1 "Terms And Conditions of Use"]
     ]]
[:p {:style {:margin "0% 15%"}}  
[:p {:style {:text-align "center"}}
    [:strong
     [:u "Terms and Conditions of Use for Aerolyze"]]]
   [:p "Blue Moon Analytics LLC (hereinafter referred to as “Blue Moon”, “Aerolyze” or the “Company”) and its websites, www.bluemoonanalytics.com, "
    [:a {:href "https://www.aerolyze.com/"} "www.aerolyze.com"] " and the corresponding enterprise software found therein (the websites and software shall collectively be referred to herein as, the “Site” or the “Website”) provides its products and services to you subject to the following conditions. Please read these Terms and Conditions (the “Terms”) carefully before accessing or using the Site. By accessing, registering for or using the Site, or purchasing products through the Site, you agree to be bound by these Terms, which are as follows:"]
   [:p "Where appropriate, Blue Moon is referred to below as “Aerolyze,” “we,” “us,” “our,” or “Company.” The term “you” refers to the user, subscriber or viewer of our website. "]
   [:p
    [:strong
     [:u "PERMISSIBLE USE OF WEBSITE"]] " "]
   [:p "You agree that: "]
   [:ul
    [:li "Your use of the Aerolyze Site is subject to and governed by these Terms and Conditions;"]]
   [:ul
    [:li "Only persons at least eighteen (18) years of age may access or use Aerolyze and transact business with Aerolyze;"]]
   [:ul
    [:li "You will comply with and be bound by these terms and conditions in their then-current form as they appear on Aerolyze each time you access and use the Aerolyze website;"]]
   [:ul
    [:li "Each visit to Aerolyze by you indicates and confirms your assent to and agreement to be bound by our then current terms and conditions; and"]]
   [:ul
    [:li "These terms and conditions are a legally binding and enforceable agreement between yourself and Aerolyze."]]
   [:p "You agree not to use or attempt to use Aerolyze for any purpose that: "]
   [:ul
    [:li "is any way unauthorized, unlawful or prohibited, or that is harmful or destructive to Aerolyze or any third party;"]]
   [:ul
    [:li "transmits any advertisements, solicitations, schemes, spam, flooding, unsolicited e-mail, or other unsolicited commercial communications;"]]
   [:ul
    [:li "transmits any harmful or disabling computer codes, spyware, adware or viruses;"]]
   [:ul
    [:li "interferes with Aerolyze’s network services;"]]
   [:ul
    [:li "attempts to gain unauthorized access to Aerolyze’s network services or proprietary information;"]]
   [:ul
    [:li "impairs or limits Aerolyze’s ability to operate the Aerolyze website or any other person’s ability to access and use Aerolyze;"]]
   [:ul
    [:li "uses any methods, means, or devices to access Aerolyze or cause access to Aerolyze for purposes of manipulating the results of any Internet search engine, or for any other purpose other than conducting business with Aerolyze;"]]
   [:ul
    [:li "unlawfully impersonates or otherwise misrepresents your affiliation with any person or entity;"]]
   [:ul
    [:li "harms minors in any way, including, but not limited to, uploading content that violates child pornography laws, child sexual exploitation laws and laws prohibiting the depiction of minors engaged in sexual conduct;"]]
   [:ul
    [:li "uploads pornographic, violent, obscene, sexually explicit, discriminatory, hateful, threatening, abusive, defamatory, offensive, harassing, or otherwise objectionable content or images;"]]
   [:ul
    [:li "harms, threatens, harasses, abuses or intimidates another person in any way or involves content that depicts, promotes, encourages, indicates, advocates or tends to incite the commission of a crime or other unlawful activities;"]]
   [:ul
    [:li "dilutes or depreciates the name and reputation of Aerolyze or any of its officers, agents, representatives or affiliates;"]]
   [:ul
    [:li "uploads any content that infringes any third party’s intellectual property rights or infringes any third party’s right of privacy; and/or"]]
   [:ul
    [:li "unlawfully uploads any confidential, proprietary or trade secret information."]]
   [:p "Aerolyze reserves the right to establish general practices and limits concerning use of the Website via different license plans and tiers of service, hereinafter a “License”, as negotiated between Aerolyze and your organization, which may include without limitation restrictions relating to options or features on the Site, number of users within an organization, the maximum time that data, calculations, messages, items, or other uploaded Content will be retained by the Website, the number of times you can edit an entry, the maximum size of any message that may be sent from or received by an account on the Website, the type and quantity of transactional data stored and presented in connection with your account, and the maximum disk space that will be allotted on Aerolyze’s servers on your behalf. You agree that Aerolyze has no responsibility or liability for the deletion or failure to store any data, messages and other communications or other Content maintained or transmitted on the Website."]
   [:p " "]
   [:p
    [:strong
     [:u "REVOCATION OF USE RIGHTS"]]]
   [:p "Aerolyze reserves the right at all times, in its sole and absolute discretion and without notice to you, to deny your access to and use of the Aerolyze website. You may not share your username or password with third parties for their use; your license is limited only to the persons agreed upon as between Aerolyze and your organization; that is to say, one (1) License per person. Violation of these Terms and Conditions may result in a variety of actions, including cancellation of your account, limits on account privileges, and forfeiture of fees paid to Aerolyze. There are no refunds on fees paid to Aerolyze in the event of a revocation of your user rights."]
   [:p "You agree and acknowledge that it is your sole responsibility and liability, to provide, obtain and maintain all of the hardware, software, electrical power, telecommunications, Internet services, and other products or services necessary to access and use Aerolyze."]
   [:p " "]
   [:p
    [:strong
     [:u "REGISTRATION"]]]
   [:p "In consideration of your use of the Website, you agree to: (a) provide true, accurate, current and complete information about yourself as prompted by the Service's registration form (such information being the &quot;Registration Data&quot;) and (b) maintain and promptly update the Registration Data to keep it true, accurate, current and complete. If you provide any information that is untrue, inaccurate, not current or incomplete, if Aerolyze has reasonable grounds to suspect that such information is untrue, inaccurate, not current or incomplete or if Aerolyze suspects that you are sharing login credentials with other parties not authorized by Aerolyze, Aerolyze has the right to suspend or terminate your account and refuse any and all current or future use of the Service (or any portion thereof). To be clear, only one (1) user is authorized per account unless Aerolyze agrees otherwise in writing. Users are prohibited from sharing, transferring, granting, leasing or selling their login credentials to the Aerolyze Site or any modules. Notwithstanding the foregoing, In the event that an employee/user is terminated, such user's credentials can be transferred over to another employee/user within your organization for the remainder of the License, provided that you notify us of such termination and submit a request for transfer of login credentials."]
   [:p " "]
   [:p
    [:strong
     [:u "LICENSE AND BILLING"]]]
   [:p "You can find the specific details regarding your License with Aerolyze, the permissions, rights and limitations thereto at any time by contacting "
    [:strong "billing@bluemoonanalytics.com"] " and requesting an account summary. Our list of fees for each type of License as well as the rights and limitations thereto shall be provided to you upon request."]
   [:p
    [:strong
     [:u "Billing:"]] " By starting your Aerolyze License, you are expressly agreeing that we are authorized to charge you the License fee associated with the type of License that you have selected during registration. Licenses are billed in accordance with your selected License and paid by you via wire transfer to our designated bank, or credit card. In the event that you prefer to pay for an annual License monthly, we will charge a twenty percent (20%) premium for such monthly billing. Additionally, if paying for an annual License monthly, you agree that we are authorized to automatically charge you the License fee at the then-current rate to the Payment Method (whether via credit card or ACH transfer) you provided during registration (or to a different Payment Method if you change your account information). The annual Aerolyze License is for a one-year period, notwithstanding whether you pay annually or monthly. Please note that prices and charges are subject to change with advanced notice. As used in these Terms and Conditions, &quot;billing&quot; shall indicate either a charge or debit, as applicable, against your Payment Method. For annual Licenses, the License fee will be billed at the beginning of the paying portion of your License and each month or year (as the case may be) thereafter unless and until you cancel your License. Request an account summary from "
    [:u "billing@bluemoonanalytics.com"] " to see the commencement date for your next renewal period. We automatically bill your Payment Method each month on the calendar day corresponding to the commencement of your paying License. License charges are fully earned upon payment. If paying annually, we will send you an invoice with our banking instructions in order for you to make payment via wire transfer prior to the end of the then-current term."]
   [:p "Note: In the event your License began on a day not contained in a given month, we bill your Payment Method on the last day of such month. For example, if you became a paying member on January 31, your Payment Method would next be billed on February 28."]
   [:p "You acknowledge that the amount billed each billing period may vary for reasons that include differing amounts due to changes in your License plan, and you authorize us to charge your Payment Method for such varying amounts. Payments are nonrefundable and there are no refunds or credits for partially used periods. We may change the fees and charges in effect, or add new fees and charges from time to time, but we will give you advance notice of these changes by e-mail. If you want to use a different Payment Method or if there is a change in Payment Method, such as your credit card validity or expiration date, you may update it on the Website or contact "
    [:u
     [:a]] "billing@bluemoonanalytics.com" " for assistance. If your Payment Method reaches its expiration date and you do not provide your updated Payment Method information or cancel your account (see, &quot;Cancellation&quot; below), you authorize us to continue billing that Payment Method and you remain responsible for any uncollected amounts."]
   [:p
    [:strong
     [:u "Ongoing License:"]] " Early termination of the License shall not result in a refund of fees paid, or in termination of payment for the months remaining in your term (if paying monthly). In the event that you purchase other modules or Licenses through the Aerolyze Site throughout the term of your License, your payment obligations will be pro-rated to the remaining term of the current license or module. Your annual Aerolyze License will continue in effect unless and until you cancel your License or we terminate it. For annual Licenses, you must cancel your License before it renews each billing period in order to avoid billing of the next License fee to your Payment Method. We will bill the License fee at the then-current rate plus any applicable U.S. tax to the Payment Method you provide to us during registration (or to a different Payment Method if you change your account information). If you are located outside the United States, you shall be responsible for any tax which may be incurred by either us or you in your home country as a result of this transaction (excluding any income tax due by us). License fees are fully earned upon payment."]
   [:p
    [:strong
     [:u "Cancellation:"]] " You may cancel your Aerolyze License at any time, and cancellation will be effective immediately. You will continue to have access to the program until the current billing period ends. We do not provide refunds or credits for any partially used License periods. To cancel your License contact us at "
    [:u "billing@bluemoonanalytics.com"] "."]
   [:p
    [:strong
     [:u "Trial License:"]] " We currently offer users a free Trial License. To participate in the Trial License you must first request a valid account with us at "
    [:u "sales@bluemoonanalytics.com"] ", and then follow all instructions on how to access the Trial License. During the Trial License period you are entitled to a limited use of the Site, provided that we retain the right to limit your use of the Website and all related services at any time, as well as the right to revoke your Trial License at any time of for any reason."]
   [:p "At the end of the Trial License you will be given the option to subscribe to the Website's Services. We will not bill or otherwise charge you for a License, or any other fees, following the Trial License period unless and until you have given your explicit consent"]
   [:p " "]
   [:p
    [:strong
     [:u "AEROLYZE AS A PLATFORM"]]]
   [:p "Aerolyze serves as a web-based platform, providing tools and various modules that facilitate, financial analysis, financial risk assessment and other Services to aid users in the purchase, leasing, and management of aircraft. We grant users access to proprietary modules, software, and analytical tools and resources with the goal of facilitating and improving its users’ experience in the purchase, lease, and management of aircraft in the marketplace (the “Platform”). We are not responsible for, and do not engage in, brokering, selling, purchasing, exchanging, or leasing for third parties. "
    [:strong "We are not a licensed financial, legal, accounting, or tax advisor or consultant. Any information offered or obtained through the Platform does not constitute expert or professional advice or counsel, or legal advice or opinion to users. User hereby releases and holds Blue Moon harmless from any responsibility as a result of any analysis or decision made by such user based on the Website."] " Users acknowledge that we do not hold or act in a position of trust and confidence in relation to user’s use of the Website platform, nor shall any action, advice, analysis, results or service offered by us to any user create such a position of trust and confidence between us and any user. As such, no personal relationship or any agency or fiduciary relationship is intended to be or shall be deemed to have been created between us and any user or third party hereunder. We make no warranties or representations about the effectiveness or accuracy of any analysis, calculations or services offered, or of the effectiveness and accuracy of analytical results, calculations or services of third parties (whether partners, affiliates or non-affiliated third parties) who may offer analysis or services through the Platform or who may be linked to via the Site, about the quality and efficacy of any such services or opinions offered by either Blue Moon or any third party, about the accuracy of information provided by any party, or about the ability of any service offered by us or any third party to address any specific need of the user."]
   [:p "Subscribers are recommended to conduct their own independent due diligence prior to following any suggestion, and all parties are encouraged to seek the help of licensed professionals as may be necessary prior to undertaking any action."]
   [:p " "]
   [:p " "] 
   [:p
    [:strong
       [:u "USER SUBMITTED CONTENT"]]]
   [:p "You, and not Aerolyze, are entirely responsible for all data that you upload, transfer, or otherwise convey or transmit (“Data”) via the Site or Platform."]
   [:p "By uploading Data to our Site or Platform, you agree:"]
   [:ul
    [:li "All Data submitted by you will be genuine and authentic, and any indicated origin, source, creator, manufacturer, and/or provenance will be true and accurate;"]
    [:li "That you own or have the necessary licenses, rights, consents and permissions (&quot;Rights&quot;) to your Data; and"]
    [:li "That you will provide true, accurate, current and complete information, and to make any and all disclosures required under applicable law in connection with any Service hereunder."]]
   [:p "By submitting your Data to Aerolyze, you hereby grant Aerolyze and its affiliates a worldwide, perpetual, royalty-free, non-exclusive, sub-licensable and transferable rights and licenses to (i) host, cache, store, archive, or index your Data in any and all forms and by whatever means; and (ii) to digitize, and store, your Data in any and all forms. (Please refer to our Privacy Policy for additional information)."]
   [:p " "]
   [:p
    [:strong
     [:u "INFORMATION"]]]
   [:p "By submitting Data on Aerolyze's Site, you agree to pay Aerolyze's fees as set forth in your "
    [:strong
     [:u "License Plan"]] ", and hereby assume full responsibility for the Data submitted."]
   [:p "Additionally, Aerolyze is prohibited from sharing your information with third parties or use your information for any purpose other than communicating with you, unless expressly permitted to do so herein or in our Privacy Policy."]
   [:p " "]
   [:p " "]
   [:p
    [:strong
     [:u "INTELLECTUAL PROPERTY RIGHTS"]]]
   [:p "The marks appearing on the Aerolyze website or any affiliated Website, including, but not limited to, Aerolyze’s respective logos, emblems, slogans, trade dress and designs are trademarks and/or service marks of Aerolyze (the “Marks”). You agree not to use or otherwise appropriate any of Aerolyze’s Marks appearing on or in association with Aerolyze or any affiliated Website. You will further indemnify Aerolyze against any loss or damage accruing to it as a result of your unauthorized use of the Aerolyze Marks, including the payment of any attorney’s fees."]
   [:p "Any third-party trademarks and/or service marks appearing on the Aerolyze Website are the property of their respective owners and may not be used without the express permission of those respective owners. You agree not to use or otherwise appropriate any third-party trademarks or service marks appearing on or in association with Aerolyze, and you assume any and all liability associated with any unauthorized use. You will further indemnify Aerolyze against any loss or damage accruing to it as a result of any unauthorized use, including the payment of any attorney’s fees."]
   [:p "You further acknowledge and agree that:"]
   [:ul
    [:li "all Marks, source code, object code, calculations, products, materials, data, information, text, screens, functionality, services, design, layout, screen interfaces, the “look and feel”, and the operation of the Aerolyze Website (the “Website Content”) are protected by various intellectual property laws in the United States and abroad, including, but not limited to, patent law, copyright law, trademark law, and common law principles of trade secret and trade dress; and"]
    [:li "all rights associated with the Website Content are owned by Aerolyze, its licensors, or third-party content providers. Furthermore, you acknowledge and agree that you do not acquire any ownership rights by downloading or viewing any Website Content. You further acknowledge and agree that you will not in any way copy, reproduce, publish, create derivative works from, perform, upload, post, distribute, transfer, transmit, modify, adapt, reverse engineer, frame in any webpage, or alter the appearance of any Website Content."]]
   [:p "You may not use the Website Content, domain names (in whole or in part), or e-mail addresses related to or derived from Aerolyze, nor any data, trademarks, functionality, service marks, trade names, brand names and/or logos contained within or derived from Aerolyze, for any purpose; meaning that you may not, among other prohibited uses, use any Website Content, domain names, e-mail addresses, data, trademarks, service marks, trade names, brand names and/or logos on or derived from Aerolyze:"]
   [:ul
    [:li "in or as any meta-tag or hidden text;"]
    [:li "in or as part of any contextual marketing directory, index, or triggering term;"]
    [:li "as content or advertising related to any other website including, but not limited to, critical, comparative, or informational websites; and/or"]]
   [:p "as a variable or data element in any algorithm that causes another Internet browser to appear on, over, or at the same time as Aerolyze or controls the content of any other Internet browser window."]
   [:p
    [:strong
     [:u "DIGITAL MILLENNIUM COPYRIGHT ACT"]]]
   [:p "Aerolyze is committed to protecting copyrights and expects you to do the same. The Digital Millennium Copyright Act of 1998 (the “DMCA”) provides recourse for copyright owners who believe that material appearing on Aerolyze infringes their rights under U.S. copyright law. If you believe in good faith that any material used or displayed on Aerolyze infringes your copyright, you (or your agent) may send us a notice requesting that the material be removed, or access to it blocked. The notice must include the following information: (a) a physical or electronic signature of a person authorized to act on behalf of the owner of an exclusive right that is allegedly infringed; (b) identification of the copyrighted work claimed to have been infringed (or if multiple copyrighted works are covered by a single notification, a representative list of such works); (c) identification of the material that is claimed to be infringing or the subject of infringing activity, and information reasonably sufficient to allow us to locate the material; (d) the name, address, telephone number and email address (if available) of the complaining party; (e) a statement that the complaining party has a good faith belief that use of the material in the manner complained of is not authorized by the copyright owner, its agent or the law; and (f) a statement that the information in the notification is accurate and, under penalty of perjury, that the complaining party is authorized to act on behalf of the owner of an exclusive right that is allegedly infringed. If you believe in good faith that a notice of copyright infringement has been wrongly filed against you, the DMCA permits you to send us a counter-notice. Notices and counter-notices must meet the then-current statutory requirements imposed by the DMCA (see "
    [:u
     [:a {:href "http://www.copyright.gov/#_blank"} "http://www.copyright.gov/"]] ") for details. DMCA notices and counter-notices should be sent to the following address: "]
   [:p {:style {:text-align "center"}}
    [:strong "Aerolyze LLC"]
    [:br]
    [:strong "Attn: DMCA Manager"]
    [:br]
    [:strong "8930 West State Rd 84"
     [:br] " Suite 184"
     [:br] " Davie, FL 33324"]]
   [:p " "]
   [:p
    [:strong
     [:u "THIRD PARTY PRODUCTS"]]]
   [:p "We may connect you with unaffiliated third parties that offer listings, products and services (the “Products and Services”). We do not verify the accuracy or veracity of any third party provider. You are strongly urged to conduct your own due diligence upon making any offers, accepting offers or contracting any services."]
   [:p " "]
   [:p
    [:strong
     [:u "LIMITATION OF LIABILITY"]]]
   [:p "Any communications or interactions between yourself and with third parties, brokers, sellers, and/or advertisers on or through the Aerolyze Website and any other terms, conditions, warranties or representations associated with such dealings, are solely between you and such third parties. You acknowledge and agree that Aerolyze is not responsible for the acts or omissions of its unaffiliated third parties and shall bear no responsibility (financial or otherwise) as a result of any action or inaction on the part of any third party with respect to your contact information, and/or any Product or Service or otherwise. Furthermore, Aerolyze shall not be responsible or liable for any loss or damage of any sort incurred as the result of any such dealings or as the result of the presence of such third parties, purchasers, sellers, brokers, service providers and/or advertisers on the Aerolyze Website. "]
   [:p "In the event that you have a problem or issue with a third party or an advisor selected by you, or incur damage as a result of third party or advisor action or inaction for any reason, you must contact the third party or advisor directly to resolve such issue. In the event that your personal data is misused by any third party or advisor, Aerolyze shall bear no responsibility for such unauthorized dissemination, and shall not be liable in any way for the actions of any third party which may receive your information. In the event of a dispute between yourself and one or more third party providers on our Site, or an advisor, you hereby release and hold Aerolyze (and our affiliates, partners and subsidiaries, and our and their respective officers, directors, employees, and agents) harmless from claims, demands, and damages (actual and consequential) of every kind and nature, known and unknown, arising out of or in any way connected with such disputes. By agreeing to these Terms you expressly waive any protections (whether statutory or otherwise) that would otherwise limit the coverage of this release to include only those claims which you may know or suspect to exist in your favor at the time of agreeing to this release."]
   [:p
    [:strong
     [:u "THIRD PARTY LINKS"]]]
   [:p
    [:strong
     [:u "Not Responsible For Links to Other Websites:"]] " From time to time this Site may include links to third party websites. These links are provided for your convenience to offer you further information on Products and Services. We have no responsibility for the content of the linked website(s). Unless expressly stated otherwise on this Site, Aerolyze does not endorse, approve, sponsor or control, and we are not in any way responsible for, any of the content, services, calculations, information, products or materials available at or through any third party web sites to which this Site may provide a link or may put you in contact with. By using this Site you acknowledge and agree that Aerolyze will not be responsible or liable to you or any other person for any damages or claims that might result from your access and use of such third party content, Product and/or Service, calculation, information, products or materials."]
   [:p
    [:strong
     [:u "REVISIONS"]]]
   [:p "You agree and acknowledge that we may revise or change these Terms and Conditions at any time, without notice to you, and you agree that you will be bound by the provisions of these Terms and Conditions as they appear on this Site at the time you access this Site. Because these Terms and Conditions may change, we encourage you to frequently review them. In addition, you agree and acknowledge that all other content, Products and Services, and materials on or available through this Site are subject to updating, cancellation and/or revision without notice to you. Aerolyze reserves the exclusive right to change pricing, at anytime, with prior notice. These Terms and Conditions were last revised on September 17"
    [:sup "th"] ", 2018."]
   [:p " "]
   [:p
    [:strong
     [:u "LOCATION"]]]
   [:p "You understand and acknowledge that Aerolyze controls and operates this Site from within the United States of America. You acknowledge and agree that you are responsible for compliance with all international, federal, state and local laws applicable to your access to and use of this Site, as well as any applicable taxes or fees resulting from the use of our Platform in your home country. "]
   [:p " "]
   [:p
    [:strong
     [:u "USER IDs AND PASSWORDS"]]]
   [:p "Certain areas or features of this Site may be restricted to users who have obtained a user identification and password by completing a registration process described on this Site. You are responsible for maintaining the confidentiality of your account and password and for restricting access to your computer, and you agree to accept responsibility for all activities that occur under your account or password. You agree to notify Aerolyze immediately if you believe your user identification, password or other identifying information has been lost, stolen or otherwise compromised. You also acknowledge and agree that you are solely responsible for all damages or claims that may arise from any access to or use of this Site by any person to whom you have provided your user identification, password or other identifying information (notwithstanding the fact that such sharing of your login credentials is strictly prohibited and will result in the termination of your License), or by any person who has obtained such information from you, including, but not limited to, any access to or use of this Site that may occur after you have notified us that your user identification, password or other identifying information has been lost, stolen or otherwise compromised."]
   [:p " "]
   [:p
    [:strong
     [:u "THE INTERNET AS AN OPEN NETWORK"]]]
   [:p "While certain designated parts of this Site employ technologies to secure your data and the transmissions between you and Aerolyze, the Internet is an open system and we cannot provide absolute assurances that transmissions cannot be intercepted/decrypted by others."]
   [:p " "]
   [:p
    [:strong
       [:u "PRIVACY AND SECURITY"]]]
   [:p " "]
   [:p
    [:strong
     [:u "Required Information"]] ": We identify what information is required to use our Website, and to provide you with additional information from third parties regarding the Products and Services. If you chose not to provide such required information, you may not be able to attain the full features of the Website."]
   [:p " "]
   [:p
    [:strong
     [:u "Service Providers"]] ": In some cases, we employ or use service providers such as consultants, temporary workers and third party software developers, to complete a business process or provide a service on our behalf. When we employ service providers, we may need to share your personally identifiable information. Service providers (excluding partners and affiliates) are strictly prohibited from using your personally or proprietary information for purposes other than to act on our behalf. "]
   [:p " "]
   [:p
    [:strong
       [:u "Privacy Policy"]] ": We reserve the right to make changes to our Privacy Policy from time to time. If we plan to make significant changes to any of our privacy policies or practices with respect to how we use personally identifiable information, we’ll post those changes to the Aerolyze Site thirty (30) days before they take effect. Our privacy policy is current as of
 September 9, 2018. "]
   [:p " "]
   [:p
    [:strong
     [:u "Legal Disclosures"]] ": In some instances we may be required to disclose certain information to comply with a legal process or mandate, such as a court order, subpoena, search warrant, or law enforcement request. "]
   [:p " "]
   [:p
    [:strong
     [:u "Web Site Usage Data"]]
    [:strong ":"] " Our Site tracks usage data, including, for example, IP address, browser type and version, which pages are viewed, which page, if any, linked a visitor to our site, and which link, if any, a visitor follows off of our site. We use this data in the aggregate and on an individual level to better understand web site activity to improve our site offerings, to reconstruct activity from a session or by a user, for troubleshooting and issue resolution purposes. We may also use this data to provide you a more personalized web site experience, assistance with technical support questions, and to send you special offers, product and service updates, or other promotional materials that are relevant and tailored to your interests. If you do not want to receive these offers or promotions, simply indicate your contact preferences during the registration process, within any future communications or by sending an e-mail to support@bluemoonanalytics.com. "]
   [:p " "]
   [:p
    [:strong
     [:u "COPPA"]] ". Our Site is not designed to appeal to children under the age of thirteen (13). Therefore, we don’t knowingly attempt to solicit or receive any information from children."]
   [:p "This privacy notice should be read in conjunction with our Privacy Policy. In the event of a discrepancy between this privacy notice and our Privacy Policy, the Privacy Policy shall govern."]
   [:p " "]
   [:p
    [:strong
     [:u "INDEMNIFICATION"]] " "]
   [:p "If you make any unauthorized use of this Site or violate the Terms and Conditions: (a) you may be in violation of the laws of the United States, as well as applicable state laws, and may be subject to penalties, and (b) you may be responsible for damages caused to Aerolyze, its Site and/or its partners and affiliates. You agree to indemnify Aerolyze and its affiliates, partners, vendors and licensors, and all of the employees, officers, directors, agents and representatives thereof and to hold all of them harmless from, all costs, claims, damages, expenses or other losses, including attorney’s fees and court costs, that arise from or are related to your use of this Site, your registration and/or your breach/violation of or failure to comply with the Terms and Conditions."]
   [:p " "]
   [:p
    [:strong
       [:u "PURCHASES"]]]
   [:p "If you wish to purchase any Products or Services through unaffiliated third parties, you will be purchasing such Product or Service directly through such third party and not through Aerolyze or its partners or affiliates, and must contact such third party with any issue, question, rebate, refund, customer service or inquiry. Aerolyze may connect you with third parties offering the Product or Service that you may require, but in no way services or handles your transaction. If your product from such third party is not as advertised, damaged or defective, you must contact the third party provider to inquire into their refund or exchange policy. Neither Aerolyze, nor its partners or affiliates is responsible for the quality or condition of the Product or Service that you purchase through such unaffiliated third party. "]
   [:p
    [:strong
     [:u "DISCLAIMERS"]]]
   [:p "UNLESS OTHERWISE STATED IN WRITING, THE CONTENT, SERVICES, ANALYSIS, CALCULATIONS, INFORMATION, PRODUCTS AND MATERIALS ON OR AVAILABLE THROUGH THIS SITE ARE PROVIDED “AS IS” AND WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED. TO THE FULLEST EXTENT PERMISSIBLE UNDER APPLICABLE LAW, AEROLYZE DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ALL IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. THE CONTENT, SERVICES, CALCULATIONS, ANALYSIS, INFORMATION, PRODUCTS AND MATERIALS ON OR AVAILABLE THROUGH THIS SITE COULD INCLUDE INACCURACIES OR TYPOGRAPHICAL ERRORS AND COULD BECOME INACCURATE BECAUSE OF DEVELOPMENTS OCCURRING AFTER THEIR RESPECTIVE DATES OF PREPARATION OR PUBLICATION. AEROLYZE HAS NO OBLIGATION TO MAINTAIN THE CURRENCY OR ACCURACY OF ANY CONTENT, SERVICES, CALCULATIONS, INFORMATION, PRODUCTS OR MATERIALS ON OR AVAILABLE THROUGH THIS SITE."]
   [:p "YOU ACKNOWLEDGE AND AGREE THAT AEROLYZE, ITS PARTNERS AND AFFILIATES ARE NOT, AND SHALL NOT BE, RESPONSIBLE FOR THE RESULTS OF ANY DEFECTS THAT MAY EXIST IN THIS SITE OR ITS OPERATION, OR WITH ANY ANALYSIS RECEIVED, OR PRODUCT OR SERVICE ORDERED THROUGH THIS SITE, OR WITH THE HANDLING OF YOUR PERSONAL OR PROPRIETARY INFORMATION BY THIRD PARTIES. AS TO THE OPERATION OF THIS SITE, AEROLYZE, ITS PARTNERS AND AFFILIATES EXPRESSLY DISCLAIM ALL WARRANTIES OF ANY KIND, WHETHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. AEROLYZE MAKES NO REPRESENTATION OR WARRANTY THAT (A) THE OPERATION OF THIS SITE WILL MEET YOUR OR ANY OTHER USER’S REQUIREMENTS; (B) ACCESS TO THE SITE WILL BE UNINTERRUPTED, TIMELY, SECURE, OR FREE OF ERRORS, VIRUSES OR OTHER HARMFUL COMPONENTS; OR (C) ANY DEFECTS IN THIS SITE WILL BE CORRECTED. YOU AGREE THAT YOU, AND NOT AEROLYZE OR ITS PARTNERS OR AFFILIATES, WILL BEAR THE ENTIRE COST OF ALL SERVICING, REPAIR, CORRECTION OR RESTORATION THAT MAY BE NECESSARY FOR YOUR DATA, SOFTWARE PROGRAMS OR COMPUTER EQUIPMENT BECAUSE OF ANY VIRUSES, ERRORS OR OTHER PROBLEMS YOU MAY HAVE AS A RESULT OF USING OR VISITING THIS SITE."]
   [:p " "]
   [:p
    [:strong
     [:u "AEROLYZE NOT LIABLE"]]]
   [:p "YOU AGREE THAT UNDER NO CIRCUMSTANCES WILL AEROLYZE, ITS PARTNERS AND AFFILIATES BE LIABLE TO YOU OR ANY OTHER PERSON OR ENTITY FOR ANY DAMAGES OR INJURY, INCLUDING ANY DIRECT, SPECIAL, INCIDENTAL, CONSEQUENTIAL OR PUNITIVE DAMAGES OR ANY DAMAGES OR INJURY CAUSED BY ERROR, INACCURACY, OMISSION, INTERRUPTION, DEFECT, FAILURE OF PERFORMANCE, DELAY IN OPERATION OR TRANSMISSION, TELECOMMUNICATIONS FAILURE OR COMPUTER VIRUS OR OTHER PROBLEM, THAT MAY RESULT FROM THE USE OF, OR THE INABILITY TO USE, THIS SITE OR THE CONTENT, SERVICES, ANALYSIS, CALCULATIONS, INFORMATION, PRODUCTS OR MATERIALS ON OR AVAILABLE THROUGH THIS SITE, WHETHER IN AN ACTION ALLEGING BREACH OF CONTRACT, NEGLIGENCE OR ANY OTHER CAUSE OF ACTION, OR ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF ANY CONTENT, SERVICES, CALCULATIONS, INFORMATION, PRODUCTS OR MATERIALS ON OR AVAILABLE THROUGH THIS SITE. YOU AGREE THAT AEROLYZE SHALL NOT BE LIABLE EVEN IF WE OR OUR AUTHORIZED REPRESENTATIVES HAVE BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES."]
   [:p "APPLICABLE LAW MAY NOT ALLOW THE EXCLUSION OF CERTAIN WARRANTIES OR THE LIMITATION OR EXCLUSION OF LIABILITY FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES. ACCORDINGLY, SOME OF THE ABOVE LIMITATIONS OR EXCLUSIONS MAY NOT APPLY TO YOU. HOWEVER, IN NO EVENT SHALL AEROLYZE OR ITS PARTNERS OR AFFILIATES'; TOTAL LIABILITY TO YOU FOR DAMAGES, LOSSES, AND CAUSES OF ACTION (WHETHER IN CONTRACT, TORT OR OTHERWISE) EXCEED THE AMOUNT PAID BY YOU, IF ANY, IN ACCESSING OR USING THIS SITE."]
   [:p " "]
   [:p
    [:strong
     [:u "COMMUNICATIONS WITH COMPANY"]]]
   [:p
    [:strong
     [:u "Time Sensitive Instructions:"]] " When communicating with us through this Site, instant messenger chat or via e-mail, do not use the Site, instant messenger, chat or e-mail to communicate any time-sensitive instructions. Such instructions may not be received or otherwise honored. All transactions conducted on this Site, instant messenger, chat or via e-mail, must be confirmed in writing by us to be accepted by and binding upon us."]
   [:p
    [:strong
     [:u "E-Signature:"]] " General communications through this Site, instant messenger, chat or via e-mail are not intended by us to constitute either an electronic record or an electronic signature, or to constitute any agreement by the sender to conduct a transaction by electronic means, unless a specific statement to the contrary is included in the message and specific e-signature procedures are employed. However, your assent to a “click to accept” button or box is binding upon you."]
   [:p
    [:strong
     [:u "Recording &amp; Monitoring of Communications:"]] " Your communications with us via the Site, instant messenger, chat, e-mail, and telephone may be recorded or monitored and by using such communications methods you are consenting to the recording or monitoring of the same."]
   [:p
    [:strong
     [:u "Prohibited E-mail Content"]]
    [:strong ":"] " All of our employees are prohibited from using e-mail to make or send any type of menacing, defamatory, discriminatory, harassing, offensive or threatening statements/materials, or statement/materials that infringe the copyrights or legal rights of others in e-mail. Such communications are against Company policy and outside the scope of our employee’s employment. The Company does not accept any liability in respect of such communication, and the employee responsible will be personally liable for any damages or other liability arising. Please report any such violations to Aerolyze. The use of the Company’s e-mail facilities for purposes of sending menacing, harassing, offensive or threatening messages to our employees is strictly prohibited and is unlawful; violators will be prosecuted to the fullest extent of the law."]
   [:p
    [:strong
     [:u "Negligent Misstatement"]]
    [:strong ":"] " The Company disclaims any and all responsibility, including responsibility based on negligence or negligent misstatement, for the accuracy, completeness, or reliability of data or information contained in or furnished through e-mail or furnished by third parties and the Company makes no warranties, express or implied, with respect to such data or information."]
   [:p
    [:strong
     [:u "Opt-Out"]]
    [:strong ":"] " E-mails sent by us may constitute an advertisement or solicitation under U.S. law, if its primary purpose is to advertise or promote a commercial product or service. If you do not wish to receive advertising and promotional messages from Aerolyze, you may opt-out by sending an e-mail to support@bluemoonanalytics.com."]
   [:p
    [:strong
     [:u "Viruses"]]
    [:strong ":"] " Computer viruses can be transmitted via e-mail (whether through @bluemoonanalytics.com emails or @aerolyze.com emails) through e-mail content, attachments to e-mails and embedded links. Although our e-mails are believed to be free of any virus or other defects that might affect computer systems in which they are received and opened, it is the recipient’s responsibility to ensure that any e-mail they open is virus free. The Company is not responsible for any loss or damage arising in any way from the hacking, receipt, use, storage or transmission of our e-mails. If our Company forwards an e-mail or replies to a prior e-mail, the contents may have been produced by someone other than our Company or our Team Members or hacked, for which the Company assumes no liability whatsoever. "
    [:u "THE COMPANY DISCLAIMS ANY REPRESENTATION OR WARRANTY THAT COMPANY E-MAILS OR THE SITE ARE VIRUS FREE AND/OR ERROR FREE"] ". The use of e-mail to introduce any virus, malicious or disabling code, or to otherwise interfere with the Company’s e-mail transmissions, telecommunication, or computer networks is prohibited and against the law; violators will be prosecuted to the fullest extent of the law."]
   [:p " "]
   [:p
    [:strong
     [:u "ADDITIONAL TERMS"]]]
   [:p "You acknowledge that certain features of this Site, as well other products and services of Aerolyze, including those that may be available through this Site, may be subject to terms, conditions and disclaimers in addition to these Terms and Conditions, and you agree that your use of such products and services will be subject to such additional terms, conditions and disclaimers."]
   [:p
    [:strong
     [:u "Permission to Be Contacted:"]] " By submitting information to Aerolyze through the Site or otherwise, you are making an inquiry as to Products and Services offered by Aerolyze or any of its unaffiliated third parties, and give Aerolyze and its affiliates permission to contact you through e-mail, fax, or telephone, or any means, even if your phone number is on a “Do Not Call” list."]
   [:p
    [:strong
     [:u "Reasonable Efforts:"]] " Aerolyze is not responsible for delays resulting from third parties. "]
   [:p " "]
   [:p
    [:strong
     [:u "GOVERNING LAW"]]]
   [:p "You agree that these Terms of Use and our Privacy Policy shall be governed by and construed in accordance with the laws of the State of Florida, without giving effect to any principles of conflicts of law. You agree that any action at law or in equity arising out of or relating to these Terms and Conditions, the Privacy Policy or the use of this Site shall be filed only in the state or federal courts located in Broward County, Florida, and you hereby consent and submit to the personal jurisdiction of such courts for the purposes of litigating any such action. You further agree to waive any rights you may have to a trial by jury. "]
   [:p " "]
   [:p
    [:strong
     [:u "SEVERABILITY "]]]
   [:p "You agree that if any provision of these Terms and Conditions shall be found to be unlawful or void, or for any reason unenforceable, then that provision shall be deemed severable from the other provisions of these Terms and Conditions and shall not affect the validity and enforceability of such other provisions."]
   [:p {:style {:text-align "center"}}
     [:em "© 2018 Blue Moon Analytics LLC. All rights reserved."]]]
]   
  )

