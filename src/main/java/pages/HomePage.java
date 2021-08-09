package pages;

import okhttp3.Challenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    private By formAuthentication = By.cssSelector(("a[href='/login']"));
    private By dropdownLink = By.cssSelector("a[href=\"/dropdown\"]");
    private By forgotPasswordLink = By.cssSelector("a[href=\"/forgot_password\"]");
    private By hoverLink = By.cssSelector("a[href=\"/hovers\"]");
    private By keys = By.cssSelector("a[href=\"/key_presses\"]");
    private By horizontalSliderLink = By.cssSelector("a[href=\"/horizontal_slider\"]");
    private By alertPage = By.cssSelector("a[href=\"/javascript_alerts\"]");
    private By fileUploadPage = By.cssSelector("a[href=\"/upload\"]");
    private By contextMenuPage = By.cssSelector("a[href=\"/context_menu\"]");
    private By  WYSIWYGEditorPage= By.cssSelector("a[href=\"/tinymce\"]");
    private By frameLink = By.cssSelector("a[href=\"/frames\"]");
    private By dynamicPageLoadingLink = By.cssSelector("a[href=\"/dynamic_loading\"]");
    private By largeAndDeepLink = By.cssSelector("a[href=\"/large\"]");
    private By infiniteScrollLink = By.cssSelector("a[href=\"/infinite_scroll\"]");
    private By multipleWindowsLink = By.cssSelector("a[href=\"/windows\"]");
    private By abTestLink = By.cssSelector("a[href=\"/abtest\"]");
    private By addRemoveLink = By.cssSelector("a[href=\"/add_remove_elements/\"]");
    private By basicAuthLink = By.cssSelector("a[href=\"/basic_auth\"]");
    private By notificationLink = By.cssSelector("a[href=\"/notification_message\"]");
    private By checkboxLink = By.cssSelector("a[href=\"/checkboxes\"]");
    private By brokenImagesLink = By.cssSelector("a[href=\"/broken_images\"]");
    private By typoPageLink = By.cssSelector("a[href=\"/typos\"]");
    private By statusCodePageLink = By.cssSelector("a[href=\"/status_codes\"]");
    private By disappearingElementPageLink = By.cssSelector("a[href=\"/disappearing_elements\"]");
    private By entryAdPageLink = By.cssSelector("a[href=\"/entry_ad\"]");
    private By exitIntentPageLink = By.cssSelector("a[href=\"/exit_intent\"]");
    private By dragAndDropPageLink = By.cssSelector("a[href=\"/drag_and_drop\"]");
    private By dataTablePageLink = By.cssSelector("a[href=\"/tables\"]");
    private By dyncmicContentPageLink = By.cssSelector("a[href=\"/dynamic_content\"]");
    private By dyncmicControlPageLink = By.cssSelector("a[href=\"/dynamic_controls\"]");
    private By floatingMenuPageLink = By.cssSelector("a[href=\"/floating_menu\"]");
    private By jQueryUIMenuPageLink = By.cssSelector("a[href=\"/jqueryui/menu\"]");
    private By geolocationPageLink = By.cssSelector("a[href=\"/geolocation\"]");
    private By shiftingContentPageLink = By.cssSelector("a[href=\"/shifting_content\"]");
    private By challangingDOMPageLink = By.cssSelector("a[href=\"/challenging_dom\"]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationPageLink(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownPageLink(){
        driver.findElement(dropdownLink).click();
        return  new DropdownPage(driver);
    }
    public ForgotPasswordPage clickForgotPasswordPageLink(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);

    }

    public HoverPage clickHoverPageLink(){
        driver.findElement(hoverLink).click();
        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPressPageLink(){
        driver.findElement(keys).click();
        return new KeyPressPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPageLink(){
        driver.findElement(horizontalSliderLink).click();
        return  new HorizontalSliderPage(driver);
    }

    public AlertPage clickAlertPageLink(){
        driver.findElement(alertPage).click();
        return new AlertPage(driver);
    }
    public FileUploadPage clickFileUploadPageLink(){
        driver.findElement(fileUploadPage).click();
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickContextMenuPageLink(){
        driver.findElement(contextMenuPage).click();
        return new ContextMenuPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditorPageLink(){
        driver.findElement(WYSIWYGEditorPage).click();
        return new WYSIWYGEditorPage(driver);

    }

    public FramePage clickFramePageLink(){
        driver.findElement(frameLink).click();
        return new FramePage(driver);
    }

    public DynamicPageLoad clickdynamicPageLoadPageLink(){
        driver.findElement(dynamicPageLoadingLink).click();
        return new DynamicPageLoad(driver);

    }
    public LargeDeepDomPage clickLargeDeepDomPageLink(){
        driver.findElement(largeAndDeepLink).click();
        return new LargeDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPageLink(){
        driver.findElement(infiniteScrollLink).click();
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsPageLink(){
        driver.findElement(multipleWindowsLink).click();
        return new MultipleWindowsPage(driver);
    }

    public ABTestingPage clickABTestingPageLink(){
        driver.findElement(abTestLink).click();
        return  new ABTestingPage(driver);
    }

    public AddRemovePage clickAddRemovePageLink(){
        driver.findElement(addRemoveLink).click();
        return new AddRemovePage(driver);
    }
    public BasicAuthPage clickBasicAuthPageLink(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        return new BasicAuthPage(driver);
    }
    public DigestAuthPage clickDigestAuthPageLink(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        return new DigestAuthPage(driver);
    }
    public NotificationPage clickNotificationPageLink(){
        driver.findElement(notificationLink).click();
        return new NotificationPage(driver);
    }
    public CheckboxPage clickCheckBoxPageLink(){
        driver.findElement(checkboxLink).click();
        return  new CheckboxPage(driver);
    }

    public BrokenImagePage clickBrokenImagePageLink(){
        driver.findElement(brokenImagesLink).click();
        return new BrokenImagePage(driver);
    }

    public TypoPage clickTypoPageLink(){
        driver.findElement(typoPageLink).click();
        return new TypoPage(driver);
    }
    public StatusCodePage clickStatusCodePageLink(){
        driver.findElement(statusCodePageLink).click();
        return new StatusCodePage(driver);
    }
    public DisappearingPage clickDisapperingPageLink(){
        driver.findElement(disappearingElementPageLink).click();
        return new DisappearingPage(driver);
    }

    public EntryAdPage clickEntryAdPageLink(){
        driver.findElement(entryAdPageLink).click();
        return new EntryAdPage(driver);
    }

    public ExitIntentPage clickExitIntenPage(){
        driver.findElement(exitIntentPageLink).click();
        return new ExitIntentPage(driver);
    }
    public DragAndDropPage clickDragAndDropPageLink(){
        driver.findElement(dragAndDropPageLink).click();
        return new DragAndDropPage(driver);
    }

    public DataTablePage clickDataTablePageLink(){
        driver.findElement(dataTablePageLink).click();
        return new DataTablePage(driver);
    }

    public DynamicContentPage clickDynamicContentPageLink(){
        driver.findElement(dyncmicContentPageLink).click();
        return new DynamicContentPage(driver);
    }

    public DynamicControlPage clickDynamicControlPageLink(){
        driver.findElement(dyncmicControlPageLink).click();
        return new DynamicControlPage(driver);
    }

    public FloatingMenuPage clickFloatingMenuPageLink(){
        driver.findElement(floatingMenuPageLink).click();
        return new FloatingMenuPage(driver);
    }

    public JQueryUIMenuPage clickJQueryUIMenuPageLink(){
        driver.findElement(jQueryUIMenuPageLink).click();
        return new JQueryUIMenuPage(driver);
    }

    public GeolocationPage clickGeolocationPageLink(){
        driver.findElement(geolocationPageLink).click();
        return new GeolocationPage(driver);
    }

    public ShitingContentPage clickShiftingContentPageLink(){
        driver.findElement(shiftingContentPageLink).click();
        return new ShitingContentPage(driver);
    }

    public ChallengingDOMPage clickChallengingDOMPageLink(){
        driver.findElement(challangingDOMPageLink).click();
        return new ChallengingDOMPage(driver);
    }



}