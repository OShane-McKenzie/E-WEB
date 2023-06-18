
fun hotel(){
    val html = buildString {
        append(Doctype())
        append(HtmlOpen())
        append(HeadInline(TitleInline("Hotel Website")))
        append(BodyOpen())
        // Header Section
        append(
            HeaderInline(styles = Styles(BACKGROUND_COLOR to "#333", PADDING to "20px"), contents = buildString {
                append(H1Inline(styles = Styles(COLOR to "#fff"), contents = "Welcome to Our Hotel"))
            })
        )
        // Main Content Section
        append(SectionInline(styles = Styles(PADDING to "20px"), contents = buildString {
            // Hero Image
            append(DivInline(styles = Styles(BACKGROUND to "url('hero.png')", BACKGROUND_SIZE to "cover", HEIGHT to "400px"), contents = ""))
            // Hotel Information
            append(DivInline(styles = Styles(PADDING to "20px"), contents = buildString {
                append(H2Inline(styles = Styles(COLOR to "#333"), contents = "About Our Hotel"))
                append(PInline(contents = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Sed viverra purus eu libero commodo ultrices. Proin faucibus sem sit amet " +
                        "ligula ultricies, in volutpat metus placerat."))
                append(ButtonInline(styles = Styles(BACKGROUND_COLOR to "#333", COLOR to "#fff"), text = "Book Now", onClick = "bookHotel()"))
            }))
        }))
        // Footer Section
        append(FooterInline(styles = Styles(BACKGROUND_COLOR to "#333", PADDING to "20px"), contents = buildString {
            append(PInline(styles = Styles(COLOR to "#fff"), contents = "© 2023 Hotel. All rights reserved."))
        }))
        append(BodyClose())
        append(HtmlInline(styles = Styles(FONT_FAMILY to "Arial, sans-serif", COLOR to "#333"), contents = " "))
    }
    saveHTML(html, "hotel")
}

fun profile(){
    fun generateDeveloperProfile(): String {
        val profileStyles = Styles(
            BACKGROUND_COLOR to "#f5f5f5",
            FONT_FAMILY to "Arial, sans-serif",
            COLOR to "#333",
            MAX_WIDTH to "800px",
            MARGIN to "0 auto",
            BOX_SHADOW to "0 2px 5px rgba(0, 0, 0, 0.1)",
            BORDER_RADIUS to "8px"
        )

        val headerStyles = Styles(
            BACKGROUND_COLOR to "#4285F4",
            COLOR to "#fff",
            PADDING to "20px",
            TEXT_ALIGN to "center",
            BORDER_TOP_LEFT_RADIUS to "8px",
            BORDER_TOP_RIGHT_RADIUS to "8px"
        )

        val footerStyles = Styles(
            BACKGROUND_COLOR to "#333",
            COLOR to "#fff",
            PADDING to "20px",
            TEXT_ALIGN to "center",
            BORDER_BOTTOM_LEFT_RADIUS to "8px",
            BORDER_BOTTOM_RIGHT_RADIUS to "8px"
        )

        val contentStyles = Styles(
            PADDING to "20px"
        )

        val headingStyles = Styles(
            COLOR to "#4285F4",
            MARGIN_BOTTOM to "10px"
        )

        val paragraphStyles = Styles(
            LINE_HEIGHT to "1.6"
        )

        val linkStyles = Styles(
            COLOR to "#4285F4",
            TEXT_DECORATION to "none"
        )

        val imageStyles = Styles(
            BORDER_RADIUS to "50%",
            BOX_SHADOW to "0 0 5px rgba(0, 0, 0, 0.2)",
            HEIGHT to "100px",
            WIDTH to "100px"
        )

        return DivInline(
            styles = profileStyles, contents = """
        ${HeaderInline(styles = headerStyles, contents = "Developer Profile")}
        
        ${
                SectionInline(
                    styles = contentStyles, contents = """
            ${ImgInline("src = \"me2.png\", alt = \"Profile Picture\"",styles = imageStyles)}
            ${H1Inline(styles = headingStyles, contents = "O'Shane McKenzie")}
            ${PInline(styles = paragraphStyles, contents = "Software Engineer")}
            ${
                        PInline(
                            styles = paragraphStyles,
                            contents = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend aliquet lorem non pharetra."
                        )
                    }
            
            ${H2Inline(styles = headingStyles, contents = "Skills")}
            ${
                        UlInline(
                            styles = "", contents = """
                ${LiInline(styles = "", contents = "Kotlin")}
                ${LiInline(styles = "", contents = "Python")}
                ${LiInline(styles = "", contents = "JavaScript")}
            """
                        )
                    }
            
            ${H2Inline(styles = headingStyles, contents = "Projects")}
            ${
                        UlInline(
                            styles = "", contents = """
                ${LiInline(styles = "", contents = "Project 1")}
                ${LiInline(styles = "", contents = "Project 2")}
                ${LiInline(styles = "", contents = "Project 3")}
                ${LiInline(styles = "", contents = "Project 4")}
            """
                        )
                    }
            
            ${H2Inline(styles = headingStyles, contents = "Contact")}
            ${PInline(styles = paragraphStyles, contents = "Email: oshanemckenzie5@gmail.com")}
            ${PInline(styles = paragraphStyles, contents = "Phone: +123456789")}
            ${
                        PInline(
                            styles = paragraphStyles,
                            contents = AInline(linkStyles, href = "https://example.com", text = "Website")
                        )
                    }
        """
                )
            }
        
        ${FooterInline(styles = footerStyles, contents = "© 2023 O'Shane McKenzie")}
    """
        )
    }
    saveHTML(generateDeveloperProfile(), "profile")
}

fun article(){
    val page = buildString{
        val headerStyles = Styles(
            PADDING to "10px",
            BACKGROUND_COLOR to cssBlack,
            COLOR to cssWhite,
            TEXT_ALIGN to "center",
            FONT_SIZE to "32px"
        )
        val footerStyles = Styles(
            PADDING to "10px",
            BACKGROUND_COLOR to cssBlack,
            COLOR to cssGold,
            TEXT_ALIGN to "center",
            FONT_SIZE to "12px"
        )
        val articleTitleStyles = Styles(
            BACKGROUND_COLOR to cssGray,
            TEXT_ALIGN to "center",
            COLOR to cssWhite,
            MAX_WIDTH to "1000px",
            MARGIN to "0 auto",

            )
        val articleSubSectionsStyles = Styles(
            FONT_WEIGHT to "bold",
            FONT_SIZE to "16px",
            MARGIN to "0 auto",
            MAX_WIDTH to "1000px",
            COLOR to cssWhite
        )
        val articleSubSectionsBodyStyles = Styles(
            FONT_WEIGHT to "normal",
            FONT_SIZE to "16px",
            MAX_WIDTH to "1000px",
            MARGIN to "0 auto",
            COLOR to cssWhite
        )
        val bodyStyles = Styles(
            BACKGROUND_IMAGE to "url('ftl.png')",
            BACKGROUND_REPEAT to "no-repeat",
            BACKGROUND_SIZE to "cover"
        )
        val title = TitleInline("ExampleBloggers.Com").nl()
        val docType = Doctype().nl()
        val header = HeaderInline("The Serious Blogger", headerStyles).nl()
        val footer = FooterInline("© 2023 Serious Blogger",footerStyles)
        val introduction = PInline("Introduction:",articleSubSectionsStyles).nl()
        val secondSection = PInline("Understanding the Cosmic Speed Limit:",articleSubSectionsStyles).nl()
        val thirdSection = PInline("Altering Space-Time:",articleSubSectionsStyles).nl()
        val fourthSection = PInline("Quantum Entanglement and Quantum Tunnelling:",
            articleSubSectionsStyles).nl()
        val fifthSection = PInline("The Path Ahead - Ongoing Research and Speculation:",
            articleSubSectionsStyles).nl()
        val sixthSection = PInline("Conclusion:",articleSubSectionsStyles).nl()
        val intro = PInline(blogIntro.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val section2 = PInline(blogSection2.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val section3 = PInline(blogSection3.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val section4 = PInline(blogSection4.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val section5 = PInline(blogSection5.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val section6 = PInline(blogSection6.lt(tabs = 3),articleSubSectionsBodyStyles).lt(lines = 2)
        val blogTitle = DivInline(H2Inline("The Quest for Faster-Than-Light Travel: " +
                "Breaking the Cosmic Speed Limit").nl(),articleTitleStyles).nl()
        val article = ArticleInline(
            "\n"+blogTitle+ introduction+ intro+ Br()+ secondSection+ section2+
                    Br()+ thirdSection+ section3+ Br()+ fourthSection+ section4+ Br()+ fifthSection+ section5+ Br()+
                    sixthSection+ section6,
            Styles(
                BACKGROUND_COLOR to cssTransparentBlack70,
                MAX_WIDTH to "1050px",
                MARGIN to "0 auto",
                BORDER_RADIUS to "10px",
                BORDER to "1px solid $cssWhite",
                PADDING_BOTTOM to "10px"
            )
        ).nl()
        val body = BodyInline("\n"+article,bodyStyles).nl()
        append(docType,title,header,Br()+body+Br(),footer)
    }
    saveHTML(page ,"blog")
}

fun profileTwo(){
    fun getElementList(elements:List<Any>):String{
        var returnElements = ""
        for (i in elements){
            returnElements += (i as String)+"\n"
        }
        return returnElements
    }
    val body = Styles(
        FONT_FAMILY to "Arial, sans-serif",
        MARGIN to "0",
        PADDING to "0",
        BACKGROUND_COLOR to cssBlack
    )
    val header = Styles(
        BACKGROUND_COLOR to cssNavy,
        COLOR to cssWhite,
        HEIGHT to "fit-content",
        TEXT_ALIGN to "center"
    )
    val h1 = Styles(
        MARGIN to "0",
        FONT_SIZE to "32px"
    )
    val mainBody = Styles(
        MAX_WIDTH to "800px",
        MARGIN to "20px auto",
        PADDING to "20px",
        BACKGROUND_COLOR to cssTransparentWhite70,
        BOX_SHADOW to "0 0 5px rgba(0, 0, 0, 0.1)",
        POSITION to "relative",
        Z_INDEX to "1",
        COLOR to cssBlack,
        BORDER_RADIUS to "10px",
        BORDER to "1px solid $cssWhite"
    )
    val mainH3mainP = Styles(
        BACKGROUND_COLOR to cssBlack,
        COLOR to cssLavender,
        PADDING to "10px",
        MARGIN to "0"
    )
    val profileImg = Styles(
        WIDTH to "250px",
        HEIGHT to "250px",
        BORDER_RADIUS to "250px",
        OBJECT_FIT to "scale-down",
        MARGIN to "20px auto",
        DISPLAY to "block",
        BOX_SHADOW to "0 0 5px rgba(0, 0, 0, 0.1)"
    )
    val slider = Styles(
        WIDTH to "100%",
        JUSTIFY_CONTENT to "center",
        OVERFLOW to "hidden"
    )
    val sContainer = Styles(
        WIDTH to "30%",
        HEIGHT to "30%"
    )
    val sSlide = Styles(
        BORDER to "1px $cssBlue",
        BORDER_RADIUS to "10px",
        WIDTH to "50px",
        HEIGHT to "100%",
        MARGIN to "10px",
        PADDING to "10px",
        OBJECT_FIT to "cover",
        BACKGROUND_COLOR to cssBlack,
        BOX_SHADOW to "0 0 5px rgba(0, 0, 0, 0.1)"
    )
    val sSImg = Styles(
        MAX_WIDTH to "100%",
        OBJECT_FIT to "scale-down",
        MARGIN_BOTTOM to "10px"
    )
    val terminal = Styles(
        POSITION to "absolute",
        Z_INDEX to "0",
        PADDING to "20px",
        COLOR to cssWhite,
        BACKGROUND_COLOR to "transparent"
    )
    val mainElements = mutableListOf<Any>(
        ImgInline("class=\"profile-img\" src=\"me3.jpg\" alt=\"Profile Photo\"",profileImg),
        H2Inline("About me"),
        H4Inline("Insert a brief introduction about yourself here."),
        H3Inline("Projects"),
        DivInline(
            DivInline(
                DivInline(
                    DivInline(
                        ImgInline("src=\"csq-py.png\" alt=\"Project 1\"",sSImg)+
                                H3Inline("Project 1",mainH3mainP)+
                                PInline("Project 1 description.",mainH3mainP
                                ),
                        sSlide,"class=\"swiper-slide\"")+"\n"+
                            DivInline(
                                ImgInline("src=\"quizzer.png\" alt=\"Project 1\"",sSImg)+
                                        H3Inline("Project 2",mainH3mainP)+
                                        PInline("Project 2 description.",mainH3mainP
                                        ),
                                sSlide,"class=\"swiper-slide\"")+"\n"+
                            DivInline(
                                ImgInline("src=\"law-resource.png\" alt=\"Project 1\"",sSImg)+
                                        H3Inline("Project 3",mainH3mainP)+
                                        PInline("Project 3 description.",mainH3mainP
                                        ),
                                sSlide,"class=\"swiper-slide\"")+"\n"+
                            DivInline(
                                ImgInline("src=\"csq-py.png\" alt=\"Project 1\"",sSImg)+
                                        H3Inline("Project 4",mainH3mainP)+
                                        PInline("Project 4 description.",mainH3mainP
                                        ),
                                sSlide,"class=\"swiper-slide\""),
                    "",
                    "class=\"swiper-wrapper\""
                ),
                sContainer,"class=\"swiper-container\""
            ),
            slider,"class=\"project-slider\""
        )
    )
    val bodyElements = mutableListOf<Any>(
        ScriptInline("src=\"prism.js\""),
        ScriptInline("src=\"https://unpkg.com/swiper/swiper-bundle.min.js\""),
        PreInline(CodeInline("", styles =  terminal, "class=\"language-css\" id=\"terminal\"")),
        MainInline(getElementList(mainElements),mainBody),
    )
    val site = mutableListOf<Any>(
        Doctype(),
        HtmlInlineSemi("lang=\"en\""),
        HeadOpen(),
        MetaInline("charset=\"UTF-8\""),
        MetaInline("name=\"viewport\" content=\"width=device-width, initial-scale=1.0\""),
        TitleInline("O'Shane McKenzie Dev-Profile"),
        LinkInline("href=\"https://cdn.jsdelivr.net/npm/prismjs/themes/prism.css\" rel=\"stylesheet\""),
        LinkInline("href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" rel=\"stylesheet\""),
        HeadClose(),
        HeaderInline(H1Inline("O'Shane McKenzie",h1),header),
        BodyInline(getElementList(bodyElements)+"\n$"+ScriptInline("src=\"codeWriter.js\""),body),
        HtmlClose()
    )
    val createSite = siteBuilder(site)
    saveHTML(createSite,"profile2")
}
