# liferay-practice
Task 1. Developing test application on “Liferay Portal”
Aims:  Learn the basic of developing on Liferay. Learn about different types of applications/plugins one can develop for Liferay. Learn about the main frameworks and technological stack of Liferay Portal.		
Task 1.1
Create a custom portlet that implements CRUD (Create-Read-Update-Delete) operations on your custom entity.
Requirements:
1.	Download and install:
a.	Liferay IDE;
b.	Liferay Plugins SDK;
2.	Configure the IDE (JDK, SDK, Server Runtime Evironment).
3.	Create a portlet-type plugin that contains one portlet. The portlet must show information about all users of the portal (presented as a table where one user = one row).
4.	Build and deploy the plugin artifact to the locally running portal instance.
Task 1.2
Create a custom portlet that implements CRUD (Create-Read-Update-Delete) operations on your custom entity.
Requirements:
1.	Create a new custom DB entity, implement necessary Service Layer functionality for it.
1.1.	Use Service Builder framework for generation of Data Access and Service layers code.
1.2.	The subject area of the entity – some kind of product. E.g. electronics, books, movies, hotel or airport bookings, etc.
2.	The User Interface (UI) of the portlet must have two views:
2.1.	Table view. Contains a table with all the current products.
2.1.1.	Use jQuery DataTables lib for rendering the table.
2.1.2.	Each row must have a link to the product editor view.
2.1.3.	Each row must contain information corresponding to the fields of the entity.
2.1.4.	Each row must have a “Delete” button for removing the chosen product from the database. 
Button workflow: [click on the button -> confirmation popup -> cancel/ok]
2.2.	Editor view. Contains an HTML form for creating new products and editing existing ones.
2.2.1.	The form must have both client and server side user input validation. What to validate – to your discretion.
2.2.2.	The fields of the form correspond to the entity structure.
2.2.3.	The view has a “Back” button – redirects to the table view on click.
2.2.4.	The view has a “Delete” button – the workflow same as in the table view. After deleting, user is redirected to table view.
2.2.5.	The view has a “Create/Update/Save” button – creates a new entity instance (product) or updates the current one.
3.	Internationalization (i18n).
3.1.	All dynamic UI elements must be localized to the following languages: English, Russian.
4.	Liferay frameworks integration.
4.1.	The product must be taggable – implement the Tags and Categories functionality for the chosen entity. Use Liferay Asset framework.
4.2.	UI:
4.2.1.	 In the product table – show the tags for each product.
4.2.2.	 In the product editor – the user must be able to add/edit/delete tags for the product.
Literature
1.	https://dev.liferay.com/develop/learning-paths/mvc
2.	https://dev.liferay.com/develop/tutorials
Task 1.3
Create a theme-type plugin. 
Requirements (theme): 
1.	Language – “Velocity”.
2.	Parent theme – Liferay’s “Welcome” theme.
3.	Customize the color scheme of header.
4.	Make the footer sticky, change its color scheme, add to footer several links to several pages from the Guest site (not hard-coded).
Task 1.4
Customize out-of-the-box functionality of Liferay Portal. Create a simple hook-type plugin.
1.	Add a dropdown list menu item to the header’s navigation menu.
2.	Choose and remove one of any elements from the toolbar of the default WYSIWYG editor (CKEditor) that is used for editing Web-Content.
