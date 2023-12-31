# Notes on Selenium API

Link to Selenium Java documentation: [Click Here](https://www.selenium.dev/selenium/docs/api/java)

## Selenium WebDriver

<p> The primary component used in Selenium. Contains subclasses for each major web browser, <br>
    ie: Chrome, Edge, Firefox, Opera, etc. Has predefined methods located in API documentation.<br>
</p>

### WebDriver (interface)
<ol>
<li>get() - Loads a new web page in the current browser window</li>
<li>manage() - Gets the option interface</li>
<li>findElement() - Locates UI elements on web page</li>
<li>getTitle() - returns the title of the current web page</li>
<li>getCurrentUrl() - returns current web page URL</li>
<li>close() - closes the current browser window</li>
<li>quit() - closes all windows in the browser</li>


</ol>

### By()
Contains static methods to locate UI elements
<ol>
<li>id() - finds element by id</li>
<li>name() - finds element by name</li>
<li>classname() - finds element by classname</li>
<li>linkText() - finds element by link text</li>
<li>partialLinkText() - finds element by link text</li>
<li>cssSelector() - finds element by css selector</li>
<li>xpath() - finds element by xpath("//input[@id='confirm]")</li>
</ol>

### WebElement (interface)
Interface that represents html elements on webpage
<ol>
<li>click() - performs a click action on specified element</li>
<li>sendkeys() - enters keystrokes as specified in string parameter</li>
<li>clear() - erases text available in text box, text area, fields, etc.</li>
<li>getText() - returns the text in the element between tags</li>
<li>getAttribute() - returns the value of an element attribute</li>
<li>isDisplayed() - returns boolean whether element is displayed on page prior to performing actions on it</li>
<li>isEnabled() - returns boolean whether element is enabled prior to performing actions on it</li>
<li>isSelected() - returns boolean whether checkbox or radio is selected</li>

</ol>