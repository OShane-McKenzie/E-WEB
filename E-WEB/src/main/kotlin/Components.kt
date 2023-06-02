enum class Components(val value: String) {
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
    SECTION_OPEN("<section>"),
    SECTION_CLOSE("</section>"),
    SCRIPT_OPEN("<script>"),
    SCRIPT_CLOSE("</script>"),
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
    LABEL_INLINE_OPEN("<label "),
    FORM_INLINE_OPEN("<form "),
    INPUT_INLINE_OPEN("<input "),

    INLINE_CLOSURE(">"),
    LEFT_ANGLE("<"),
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
    EM_INLINE_OPEN("<em "),
    BUTTON_INLINE_OPEN("<button "),
    HTML_INLINE_OPEN("<html "),
    META_INLINE_OPEN("<meta "),
    TITLE_INLINE_OPEN("<title "),
    HEAD_INLINE_OPEN("<head "),
    BODY_INLINE_OPEN("<body "),
}