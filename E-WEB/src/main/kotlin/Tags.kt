fun Doctype(): String {
    return Components.DOCTYPE.value
}
fun HtmlOpen(): String {
    return Components.HTML_OPEN.value
}
fun TitleOpen(): String {
    return Components.TITLE_OPEN.value
}
fun TitleClose(): String {
    return Components.TITLE_CLOSE.value
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
fun DivInline(contents: String, styles: String = ""): String {
    return "${Components.DIV_INLINE_OPEN.value}$styles${Components.INLINE_CLOSURE.value}$contents${Components.DIV_CLOSE.value}"
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
fun ImgInline(styles: String = "", src: String, alt: String): String {
    return "${Components.IMG_INLINE_OPEN.value}$styles src=\"$src\" alt=\"$alt\"${Components.IMG_CLOSE.value}"
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
fun MetaInline(attributes: String): String {
    return "${Components.META_INLINE_OPEN.value}$attributes${Components.INLINE_CLOSURE.value}"
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