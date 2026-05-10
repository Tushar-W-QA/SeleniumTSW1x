package org.tusharwaraddtsw.ex03_06052026;

public class Selenium015_RuleOfFindElement {

    // There are several different types of locators that can be used, including:
    //
    //- ID: This locator type uses the **unique ID attribute** of an element to locate it on the page.
    //- Name: This locator type uses the name attribute of an element to locate it on the page.
    //- Class name: This locator type uses the class attribute of an element to locate it on the page.
    //- Tag name: This locator type uses the HTML tag name of an element to locate it on the page.
    //- Link text: This locator type uses the text of a link to locate it on the page.
    //- Partial link text: This locator type uses part of the text of a link to locate it on the page.

    // ### Locators in Selenium

    //1. Default Locators ->** id, name, class name, tag name**
    //2. anchor Tag -> link text, partial link text.
    //3. Advance Locators - XPath(Axes, Functions), CSS Selector


    // **Preference Rule**  ->
    //    1            2         3            4           5                       6               7
    //- unique ID -> name -> class Name -> TagName -> Link Text/ Partial  - CSS Selector -> XPath(95%).
    //- If it dynamic or changes( we try to avoid the Locator ) or multiple classes.
    //- If it is not unique we will avoid it.
    //- Try to **find the shortest Locator and easy to remember**, which doesn't change much.
}
