import java.io.File
enum class Components(val value: String) {
    MAIN_OPEN("<main>"),
    MAIN_CLOSE("</main>"),
    MAIN_INLINE_OPEN("<main "),
    DIV_OPEN("<div>"),
    DIV_CLOSE("</div>"),
    DOCTYPE("<!DOCTYPE html>"),
    HTML_OPEN("<html>"),
    HTML_CLOSE("</html>"),
    META_OPEN("<meta>"),
    TITLE_OPEN("<title>"),
    TITLE_CLOSE("</title>"),
    HEAD_OPEN("<head>"),
    HEAD_CLOSE("</head>"),
    I_OPEN("<i>"),
    I_CLOSE("</i>"),
    H1_OPEN("<h1>"),
    H1_CLOSE("</h1>"),
    H2_OPEN("<h2>"),
    H2_CLOSE("</h2>"),
    H3_OPEN("<h3>"),
    H3_CLOSE("</h3>"),
    H4_OPEN("<h4>"),
    H4_CLOSE("</h4>"),
    H5_OPEN("<h5>"),
    H5_CLOSE("</h5>"),
    P_OPEN("<p>"),
    P_CLOSE("</p>"),
    A_OPEN("<a>"),
    A_CLOSE("</a>"),
    IMG_OPEN("<img"),
    IMG_CLOSE(">"),
    UL_OPEN("<ul>"),
    UL_CLOSE("</ul>"),
    LI_OPEN("<li>"),
    LI_CLOSE("</li>"),
    OL_OPEN("<ol>"),
    OL_CLOSE("</ol>"),
    HEADER_OPEN("<header>"),
    HEADER_CLOSE("</header>"),
    BODY_OPEN("<body>"),
    BODY_CLOSE("</body>"),
    NAV_OPEN("<nav>"),
    NAV_CLOSE("</nav>"),
    PRE_INLINE_OPEN("<pre "),
    PRE_CLOSE("</pre>"),
    PRE_OPEN("<pre>"),
    CODE_INLINE_OPEN("<code "),
    CODE_CLOSE("</code>"),
    CODE_OPEN("<code>"),
    SECTION_OPEN("<section>"),
    SECTION_CLOSE("</section>"),
    SCRIPT_OPEN("<script>"),
    SCRIPT_CLOSE("</script>"),
    SCRIPT_INLINE_OPEN("<script "),
    ARTICLE_OPEN("<article>"),
    ARTICLE_CLOSE("</article>"),
    FOOTER_OPEN("<footer>"),
    FOOTER_CLOSE("</footer>"),
    STRONG_OPEN("<strong>"),
    STRONG_CLOSE("</strong>"),
    EM_OPEN("<em>"),
    EM_CLOSE("</em>"),
    BR("<br>"),
    HR("<hr>"),
    INPUT_OPEN("<input>"),
    INPUT_CLOSE("</input>"),
    FORM_OPEN("<form>"),
    FORM_CLOSE("</form>"),
    LABEL_OPEN("<label>"),
    LABEL_CLOSE("</label>"),
    LINK_INLINE_OPEN("<link "),
    LABEL_INLINE_OPEN("<label "),
    FORM_INLINE_OPEN("<form "),
    INPUT_INLINE_OPEN("<input "),
    INLINE_CLOSURE(">"),
    BUTTON_OPEN("<button>"),
    BUTTON_CLOSE("</button>"),
    DIV_INLINE_OPEN("<div "),
    H1_INLINE_OPEN("<h1 "),
    H2_INLINE_OPEN("<h2 "),
    H3_INLINE_OPEN("<h3 "),
    H4_INLINE_OPEN("<h4 "),
    H5_INLINE_OPEN("<h5 "),
    P_INLINE_OPEN("<p "),
    A_INLINE_OPEN("<a "),
    IMG_INLINE_OPEN("<img "),
    UL_INLINE_OPEN("<ul "),
    LI_INLINE_OPEN("<li "),
    OL_INLINE_OPEN("<ol "),
    HEADER_INLINE_OPEN("<header "),
    NAV_INLINE_OPEN("<nav "),
    SECTION_INLINE_OPEN("<section "),
    ARTICLE_INLINE_OPEN("<article "),
    FOOTER_INLINE_OPEN("<footer "),
    STRONG_INLINE_OPEN("<strong "),
    SPAN_OPEN("<span>"),
    SPAN_CLOSE("</span>"),
    SPAN_INLINE_OPEN("<span "),
    EM_INLINE_OPEN("<em "),
    BUTTON_INLINE_OPEN("<button "),
    HTML_INLINE_OPEN("<html "),
    META_INLINE_OPEN("<meta "),
    TITLE_INLINE_OPEN("<title "),
    HEAD_INLINE_OPEN("<head "),
    BODY_INLINE_OPEN("<body "),
}
const val ALIGN_CONTENT = "align-content"
const val ALIGN_ITEMS = "align-items"
const val ALIGN_SELF = "align-self"
const val BACKGROUND = "background"
const val BACKGROUND_COLOR = "background-color"
const val BACKGROUND_IMAGE = "background-image"
const val BACKGROUND_REPEAT = "background-repeat"
const val BACKGROUND_SIZE = "background-size"
const val BORDER = "border"
const val BORDER_BOTTOM = "border-bottom"
const val BORDER_LEFT = "border-left"
const val BORDER_RIGHT = "border-right"
const val BORDER_TOP = "border-top"
const val BORDER_TOP_LEFT_RADIUS ="border-top-left-radius"
const val BORDER_TOP_RIGHT_RADIUS ="border-top-right-radius"
const val BORDER_BOTTOM_LEFT_RADIUS ="border-bottom-left-radius"
const val BORDER_BOTTOM_RIGHT_RADIUS ="border-bottom-right-radius"
const val BORDER_RADIUS = "border-radius"
const val BOX_SHADOW = "box-shadow"
const val COLOR = "color"
const val DISPLAY = "display"
const val GAP = "gap"
const val FLEX = "flex"
const val FLEX_DIRECTION = "flex-direction"
const val FLEX_GROW = "flex-grow"
const val FLEX_SHRINK = "flex-shrink"
const val FLEX_WRAP = "flex-wrap"
const val FLOAT = "float"
const val FONT_FAMILY = "font-family"
const val FONT_SIZE = "font-size"
const val FONT_STYLE = "font-style"
const val FONT_WEIGHT = "font-weight"
const val HEIGHT = "height"
const val JUSTIFY_CONTENT = "justify-content"
const val LETTER_SPACING = "letter-spacing"
const val LINE_HEIGHT = "line-height"
const val LIST_STYLE = "list-style"
const val MARGIN = "margin"
const val MARGIN_BOTTOM = "margin-bottom"
const val MARGIN_LEFT = "margin-left"
const val MARGIN_RIGHT = "margin-right"
const val MARGIN_TOP = "margin-top"
const val MAX_HEIGHT = "max-height"
const val MAX_WIDTH = "max-width"
const val MIN_HEIGHT = "min-height"
const val MIN_WIDTH = "min-width"
const val OPACITY = "opacity"
const val ORDER = "order"
const val OUTLINE = "outline"
const val OUTLINE_COLOR = "outline-color"
const val OUTLINE_STYLE = "outline-style"
const val OUTLINE_WIDTH = "outline-width"
const val OVERFLOW = "overflow"
const val OBJECT_FIT = "object-fit"
const val PADDING = "padding"
const val PADDING_BOTTOM = "padding-bottom"
const val PADDING_LEFT = "padding-left"
const val PADDING_RIGHT = "padding-right"
const val PADDING_TOP = "padding-top"
const val POSITION = "position"
const val TEXT_ALIGN = "text-align"
const val TEXT_DECORATION = "text-decoration"
const val TEXT_TRANSFORM = "text-transform"
const val TOP = "top"
const val RIGHT = "right"
const val BOTTOM = "bottom"
const val LEFT = "left"
const val TRANSFORM = "transform"
const val TRANSITION = "transition"
const val VERTICAL_ALIGN = "vertical-align"
const val VISIBILITY = "visibility"
const val WHITE_SPACE = "white-space"
const val WIDTH = "width"
const val WORD_BREAK = "word-break"
const val WORD_SPACING = "word-spacing"
const val Z_INDEX = "z-index"
const val WEBKIT_ANIM_DURATION = "-webkit-animation-duration"
const val WEBKIT_ANIM_ITERATION_COUNT = "-webkit-animation-iteration-count"
const val WEBKIT_ANIM_FILL_MODE = "-webkit-animation-fill-mode"
const val ANIMATION_DURATION = "animation-duration"
const val ANIMATION_ITERATION_COUNT = "animation-iteration-count"
const val ANIMATION_FILL_MODE = "animation-fill-mode"
const val WEBKIT_TRANSITION_TIMING_FUN = "-webkit-transition-timing-function"
const val WEBKIT_TRANSFORM = "-webkit-transform"
const val TRANSITION_TIMING_FUN = "transition-timing-function"

const val cssWhite: String = "#FFFFFF"
const val cssBlack: String = "#000000"
const val cssRed: String = "#FF0000"
const val cssGreen: String = "#00FF00"
const val cssBlue: String = "#0000FF"
const val cssYellow: String = "#FFFF00"
const val cssCyan: String = "#00FFFF"
const val cssMagenta: String = "#FF00FF"
const val cssGray: String = "#808080"
const val cssLightGray: String = "#C0C0C0"
const val cssDarkGray: String = "#404040"
const val cssTransparentWhite70: String = "#FFFFFFB3"
const val cssTransparentBlack70: String = "#000000B3"
const val cssTransparentBlue70: String = "#0000FFB3"
const val cssTransparentRed70: String = "#FF0000B3"
const val cssTransparentYellow70: String = "#FFFF00B3"
const val cssOrange: String = "#FFA500"
const val cssPurple: String = "#800080"
const val cssPink: String = "#FF69B4"
const val cssLime: String = "#00FF00"
const val cssBrown: String = "#A52A2A"
const val cssNavy: String = "#000080"
const val cssMaroon: String = "#800000"
const val cssOlive: String = "#808000"
const val cssTeal: String = "#008080"
const val cssAqua: String = "#00FFFF"
const val cssSalmon: String = "#FA8072"
const val cssIndigo: String = "#4B0082"
const val cssGold: String = "#FFD700"
const val cssSilver: String = "#C0C0C0"
const val cssViolet: String = "#EE82EE"
const val cssCoral: String = "#FF7F50"
const val cssLavender: String = "#E6E6FA"
const val cssSlateGray: String = "#708090"
const val cssTurquoise: String = "#40E0D0"
const val cssOrchid: String = "#DA70D6"
const val cssSkyBlue: String = "#87CEEB"
const val cssChartreuse: String = "#7FFF00"
const val cssBeige: String = "#F5F5DC"
const val cssMintGreen: String = "#98FF98"
const val cssCrimson: String = "#DC143C"
const val cssKhaki: String = "#F0E68C"
const val cssTomato: String = "#FF6347"
const val cssSandyBrown: String = "#F4A460"
const val cssSteelBlue: String = "#4682B4"
const val cssDarkOliveGreen: String = "#556B2F"
const val cssPeru: String = "#CD853F"
const val cssRosyBrown: String = "#BC8F8F"
const val cssCornflowerBlue: String = "#6495ED"
const val cssDarkGoldenrod: String = "#B8860B"
const val cssIndianRed: String = "#CD5C5C"
const val cssMediumPurple: String = "#9370DB"
const val cssDarkSeaGreen: String = "#8FBC8F"
const val cssFireBrick: String = "#B22222"
const val cssLightCoral: String = "#F08080"
const val cssDarkKhaki: String = "#BDB76B"
const val cssMediumAquamarine: String = "#66CDAA"
const val cssDarkOrchid: String = "#9932CC"
const val cssPaleGoldenrod: String = "#EEE8AA"
const val cssMediumSpringGreen: String = "#00FA9A"
const val cssMediumSlateBlue: String = "#7B68EE"
const val cssChocolate: String = "#D2691E"
const val cssMediumTurquoise: String = "#48D1CC"

fun Doctype(): String {
    return Components.DOCTYPE.value
}
fun HtmlOpen(): String {
    return Components.HTML_OPEN.value
}
fun HtmlClose(): String {
    return Components.HTML_CLOSE.value
}
fun TitleOpen(): String {
    return Components.TITLE_OPEN.value
}
fun TitleClose(): String {
    return Components.TITLE_CLOSE.value
}
fun SpanOpen(): String {
    return Components.SPAN_OPEN.value
}
fun SpanClose(): String {
    return Components.SPAN_CLOSE.value
}
fun HeadOpen(): String {
    return Components.HEAD_OPEN.value
}
fun HeadClose(): String {
    return Components.HEAD_CLOSE.value
}
fun BodyOpen(): String {
    return Components.BODY_OPEN.value
}
fun BodyClose(): String {
    return Components.BODY_CLOSE.value
}
fun Div(contents: String):String{
    return Components.DIV_OPEN.value + contents + Components.DIV_CLOSE.value
}
fun Header(contents: String):String{
    return Components.HEADER_OPEN.value + contents + Components.HEADER_CLOSE.value
}
fun H1(contents: String): String {
    return Components.H1_OPEN.value + contents + Components.H1_CLOSE.value
}
fun H2(contents: String): String {
    return Components.H2_OPEN.value + contents + Components.H2_CLOSE.value
}
fun H3(contents: String): String {
    return Components.H3_OPEN.value + contents + Components.H3_CLOSE.value
}
fun H4(contents: String): String {
    return Components.H4_OPEN.value + contents + Components.H4_CLOSE.value
}
fun H5(contents: String): String {
    return Components.H5_OPEN.value + contents + Components.H5_CLOSE.value
}
fun P(contents: String): String {
    return Components.P_OPEN.value + contents + Components.P_CLOSE.value
}
fun A(href: String, text: String): String {
    return "${Components.A_INLINE_OPEN.value} href=\"$href\">$text${Components.A_CLOSE.value}"
}
fun Img(src: String, alt: String): String {
    return "${Components.IMG_OPEN.value} src=\"$src\" alt=\"$alt\"${Components.IMG_CLOSE.value}"
}
fun Ul(contents: String): String {
    return Components.UL_OPEN.value + contents + Components.UL_CLOSE.value
}
fun Li(contents: String): String {
    return Components.LI_OPEN.value + contents + Components.LI_CLOSE.value
}
fun Ol(contents: String): String {
    return Components.OL_OPEN.value + contents + Components.OL_CLOSE.value
}
fun Em(contents: String): String {
    return Components.EM_OPEN.value + contents + Components.EM_CLOSE.value
}
fun Strong(contents: String): String {
    return Components.STRONG_OPEN.value + contents + Components.STRONG_CLOSE.value
}
fun Br(): String {
    return Components.BR.value
}
fun Hr(): String {
    return Components.HR.value
}
fun Button(text: String, onClick: String): String {
    return "${Components.BUTTON_OPEN.value} onclick=\"$onClick\">$text${Components.BUTTON_CLOSE.value}"
}
fun Nav(contents: String): String {
    return Components.NAV_OPEN.value + contents + Components.NAV_CLOSE.value
}
fun Section(contents: String): String {
    return Components.SECTION_OPEN.value + contents + Components.SECTION_CLOSE.value
}
fun Article(contents: String): String {
    return Components.ARTICLE_OPEN.value + contents + Components.ARTICLE_CLOSE.value
}
fun Footer(contents: String): String {
    return Components.FOOTER_OPEN.value + contents + Components.FOOTER_CLOSE.value
}
fun Meta(): String {
    return Components.META_OPEN.value
}
fun I(): String {
    return Components.I_OPEN.value
}
fun IClose(): String {
    return Components.I_CLOSE.value
}
fun A(): String {
    return Components.A_OPEN.value
}
fun AClose(): String {
    return Components.A_CLOSE.value
}
fun Script(): String {
    return Components.SCRIPT_OPEN.value
}
fun ScriptClose(): String {
    return Components.SCRIPT_CLOSE.value
}
fun LabelOpen(): String {
    return Components.LABEL_OPEN.value
}
fun Form(): String {
    return Components.FORM_OPEN.value
}
fun FormClose(): String {
    return Components.FORM_CLOSE.value
}
fun Input(): String {
    return Components.INPUT_OPEN.value
}
fun LabelClose(): String {
    return Components.LABEL_CLOSE.value
}
fun InputClose(): String {
    return Components.INPUT_CLOSE.value
}
fun Main():String{
    return Components.MAIN_OPEN.value
}
fun MainClose():String{
    return Components.MAIN_CLOSE.value
}
fun MainInline(contents: String, styles: String = ""):String{
    return "${Components.MAIN_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.MAIN_CLOSE.value}"
}
fun Pre():String{
    return Components.PRE_OPEN.value
}
fun PreClose():String{
    return Components.PRE_CLOSE.value
}
fun Code():String{
    return Components.CODE_OPEN.value
}
fun CodeClose():String{
    return Components.CODE_CLOSE.value
}

fun PreInline(contents: String, styles: String = ""):String{
    return "${Components.PRE_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.PRE_CLOSE.value}"
}
fun CodeInline(contents: String, styles: String = "",attributes:String=""):String{
    return "${Components.CODE_INLINE_OPEN.value}$styles $attributes${Components.INLINE_CLOSURE.value}$contents${Components.CODE_CLOSE.value}"
}
fun ScriptInline(contents: String):String{
    return "${Components.SCRIPT_INLINE_OPEN.value}$contents${Components.INLINE_CLOSURE.value}${Components.SCRIPT_CLOSE.value}"
}
fun LabelInline(contents: String, styles: String = ""):String{
    return "${Components.LABEL_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.LABEL_CLOSE.value}"
}
fun SpanInline(contents: String, styles: String = ""):String{
    return "${Components.SPAN_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.SPAN_CLOSE.value}"
}
fun DivInline(contents: String, styles: String = "",attributes:String=""): String {
    return "${Components.DIV_INLINE_OPEN.value}$styles $attributes${Components.INLINE_CLOSURE.value}$contents${Components.DIV_CLOSE.value}"
}
fun HeaderInline(contents: String, styles: String = ""): String {
    return "${Components.HEADER_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.HEADER_CLOSE.value}"
}
fun H1Inline(contents: String, styles: String = ""): String {
    return "${Components.H1_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.H1_CLOSE.value}"
}
fun H2Inline(contents: String, styles: String = ""): String {
    return "${Components.H2_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.H2_CLOSE.value}"
}
fun H3Inline(contents: String, styles: String = ""): String {
    return "${Components.H3_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.H3_CLOSE.value}"
}
fun H4Inline(contents: String, styles: String = ""): String {
    return "${Components.H4_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.H4_CLOSE.value}"
}
fun H5Inline(contents: String, styles: String = ""): String {
    return "${Components.H5_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.H5_CLOSE.value}"
}
fun PInline(contents: String, styles: String = ""): String {
    return "${Components.P_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.P_CLOSE.value}"
}
fun AInline(styles: String = "", href: String, text: String): String {
    return "${Components.A_INLINE_OPEN.value}$styles href=\"$href\">$text${Components.A_CLOSE.value}"
}
fun ImgInline(contents: String,styles: String = ""): String {
    return "${Components.IMG_INLINE_OPEN.value}$styles $contents ${Components.IMG_CLOSE.value}"
}
fun UlInline(contents: String, styles: String = ""): String {
    return "${Components.UL_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.UL_CLOSE.value}"
}
fun LiInline(contents: String, styles: String = ""): String {
    return "${Components.LI_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.LI_CLOSE.value}"
}
fun OlInline(contents: String, styles: String = ""): String {
    return "${Components.OL_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.OL_CLOSE.value}"
}
fun EmInline(contents: String, styles: String = ""): String {
    return "${Components.EM_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.EM_CLOSE.value}"
}
fun StrongInline(contents: String, styles: String = ""): String {
    return "${Components.STRONG_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.STRONG_CLOSE.value}"
}
fun ButtonInline(styles: String = "", text: String, onClick: String): String {
    return "${Components.BUTTON_INLINE_OPEN.value}$styles onclick=\"$onClick\">$text${Components.BUTTON_CLOSE.value}"
}
fun NavInline(contents: String, styles: String = ""): String {
    return "${Components.NAV_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.NAV_CLOSE.value}"
}
fun SectionInline(contents: String, styles: String = ""): String {
    return "${Components.SECTION_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.SECTION_CLOSE.value}"
}
fun ArticleInline(contents: String, styles: String = ""): String {
    return "${Components.ARTICLE_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.ARTICLE_CLOSE.value}"
}
fun FooterInline(contents: String, styles: String = ""): String {
    return "${Components.FOOTER_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.FOOTER_CLOSE.value}"
}
fun HtmlInline(styles: String, contents: String): String {
    return "${Components.HTML_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.HTML_CLOSE.value}"
}
fun HtmlInlineSemi(attributes: String): String {
    return "${Components.HTML_INLINE_OPEN.value}$attributes${Components.INLINE_CLOSURE.value}"
}
fun MetaInline(attributes: String): String {
    return "${Components.META_INLINE_OPEN.value}$attributes${Components.INLINE_CLOSURE.value}"
}
fun LinkInline(attributes: String): String {
    return "${Components.LINK_INLINE_OPEN.value}$attributes${Components.INLINE_CLOSURE.value}"
}
fun TitleInline(contents: String, styles: String = ""): String {
    return "${Components.TITLE_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.TITLE_CLOSE.value}"
}
fun HeadInline(contents: String, styles: String = ""): String {
    return "${Components.HEAD_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.HEAD_CLOSE.value}"
}
fun BodyInline(contents: String, styles: String = ""): String {
    return "${Components.BODY_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.BODY_CLOSE.value}"
}
fun FormInline(contents: String, styles: String = ""):String{
    return "${Components.FORM_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.FORM_CLOSE.value}"
}
fun InputInline(contents: String, styles: String = ""):String{
    return "${Components.INPUT_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.INPUT_CLOSE.value}"
}

fun Styles(vararg args: Pair<String, String>): String {
    var style = ""
    val myMap = args.toMap()
    for (entry in myMap) {
        style += "${entry.key}: ${entry.value}; "
    }
    return "style=\"${style.trim()}\""
}

fun saveHTML(data: String, filePath: String) {
    val file = File("$filePath.html")
    file.writeText(data)
}

fun siteBuilder(siteStructure:List<Any>):String{
    val site = buildString {
        for (i in siteStructure){
            append((i as String))
        }
    }
    return site
}

fun String.nl():String{
    return this+"\n"
}
fun String.tb():String{
    return "\t"+this
}
//lines and tabs
fun String.lt(lines: Int = 0, tabs: Int = 0): String {
    val lineBreaks = "\n".repeat(lines)
    val tabsString = "\t".repeat(tabs)
    return "$tabsString$this$lineBreaks"
}

