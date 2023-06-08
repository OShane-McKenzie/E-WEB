
fun hotel(){
    val html = buildString {
        append(Doctype())
        append(HtmlOpen())
        append(HeadInline(TitleInline("Hotel Website")))
        append(BodyOpen())
        // Header Section
        append(
            HeaderInline(styles = Style(CSS.BACKGROUND_COLOR to "#333", CSS.PADDING to "20px"), contents = buildString {
            append(H1Inline(styles = Style(CSS.COLOR to "#fff"), contents = "Welcome to Our Hotel"))
        })
        )
        // Main Content Section
        append(SectionInline(styles = Style(CSS.PADDING to "20px"), contents = buildString {
            // Hero Image
            append(DivInline(styles = Style(CSS.BACKGROUND to "url('hero.png')", CSS.BACKGROUND_SIZE to "cover", CSS.HEIGHT to "400px"), contents = ""))
            // Hotel Information
            append(DivInline(styles = Style(CSS.PADDING to "20px"), contents = buildString {
                append(H2Inline(styles = Style(CSS.COLOR to "#333"), contents = "About Our Hotel"))
                append(PInline(contents = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Sed viverra purus eu libero commodo ultrices. Proin faucibus sem sit amet " +
                        "ligula ultricies, in volutpat metus placerat."))
                append(ButtonInline(styles = Style(CSS.BACKGROUND_COLOR to "#333", CSS.COLOR to "#fff"), text = "Book Now", onClick = "bookHotel()"))
            }))
        }))
        // Footer Section
        append(FooterInline(styles = Style(CSS.BACKGROUND_COLOR to "#333", CSS.PADDING to "20px"), contents = buildString {
            append(PInline(styles = Style(CSS.COLOR to "#fff"), contents = "© 2023 Hotel. All rights reserved."))
        }))
        append(BodyClose())
        append(HtmlInline(styles = Style(CSS.FONT_FAMILY to "Arial, sans-serif", CSS.COLOR to "#333"), contents = " "))
    }
    saveHTML(html, "hotel")
}

fun profile(){
    fun generateDeveloperProfile(): String {
        val profileStyle = Style(
            CSS.BACKGROUND_COLOR to "#f5f5f5",
            CSS.FONT_FAMILY to "Arial, sans-serif",
            CSS.COLOR to "#333",
            CSS.MAX_WIDTH to "800px",
            CSS.MARGIN to "0 auto",
            CSS.BOX_SHADOW to "0 2px 5px rgba(0, 0, 0, 0.1)",
            CSS.BORDER_RADIUS to "8px"
        )

        val headerStyle = Style(
            CSS.BACKGROUND_COLOR to "#4285F4",
            CSS.COLOR to "#fff",
            CSS.PADDING to "20px",
            CSS.TEXT_ALIGN to "center",
            CSS.BORDER_TOP_LEFT_RADIUS to "8px",
            CSS.BORDER_TOP_RIGHT_RADIUS to "8px"
        )

        val footerStyle = Style(
            CSS.BACKGROUND_COLOR to "#333",
            CSS.COLOR to "#fff",
            CSS.PADDING to "20px",
            CSS.TEXT_ALIGN to "center",
            CSS.BORDER_BOTTOM_LEFT_RADIUS to "8px",
            CSS.BORDER_BOTTOM_RIGHT_RADIUS to "8px"
        )

        val contentStyle = Style(
            CSS.PADDING to "20px"
        )

        val headingStyle = Style(
            CSS.COLOR to "#4285F4",
            CSS.MARGIN_BOTTOM to "10px"
        )

        val paragraphStyle = Style(
            CSS.LINE_HEIGHT to "1.6"
        )

        val linkStyle = Style(
            CSS.COLOR to "#4285F4",
            CSS.TEXT_DECORATION to "none"
        )

        val imageStyle = Style(
            CSS.BORDER_RADIUS to "50%",
            CSS.BOX_SHADOW to "0 0 5px rgba(0, 0, 0, 0.2)",
            CSS.HEIGHT to "100px",
            CSS.WIDTH to "100px"
        )

        return DivInline(
            styles = profileStyle, contents = """
        ${HeaderInline(styles = headerStyle, contents = "Developer Profile")}
        
        ${
                SectionInline(
                    styles = contentStyle, contents = """
            ${ImgInline(styles = imageStyle, src = "me2.png", alt = "Profile Picture")}
            ${H1Inline(styles = headingStyle, contents = "O'Shane McKenzie")}
            ${PInline(styles = paragraphStyle, contents = "Software Engineer")}
            ${
                        PInline(
                            styles = paragraphStyle,
                            contents = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend aliquet lorem non pharetra."
                        )
                    }
            
            ${H2Inline(styles = headingStyle, contents = "Skills")}
            ${
                        UlInline(
                            styles = "", contents = """
                ${LiInline(styles = "", contents = "Kotlin")}
                ${LiInline(styles = "", contents = "Python")}
                ${LiInline(styles = "", contents = "JavaScript")}
            """
                        )
                    }
            
            ${H2Inline(styles = headingStyle, contents = "Projects")}
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
            
            ${H2Inline(styles = headingStyle, contents = "Contact")}
            ${PInline(styles = paragraphStyle, contents = "Email: oshanemckenzie5@gmail.com")}
            ${PInline(styles = paragraphStyle, contents = "Phone: +123456789")}
            ${
                        PInline(
                            styles = paragraphStyle,
                            contents = AInline(linkStyle, href = "https://example.com", text = "Website")
                        )
                    }
        """
                )
            }
        
        ${FooterInline(styles = footerStyle, contents = "© 2023 O'Shane McKenzie")}
    """
        )
    }
    saveHTML(generateDeveloperProfile(), "profile")
}

fun article(){
    val page = buildString{
        val headerStyle = Style(
            CSS.PADDING to "10px",
            CSS.BACKGROUND_COLOR to cssBlack,
            CSS.COLOR to cssWhite,
            CSS.TEXT_ALIGN to "center",
            CSS.FONT_SIZE to "32px"
        )
        val footerStyle = Style(
            CSS.PADDING to "10px",
            CSS.BACKGROUND_COLOR to cssBlack,
            CSS.COLOR to cssGold,
            CSS.TEXT_ALIGN to "center",
            CSS.FONT_SIZE to "12px"
        )
        val articleTitleStyle = Style(
            CSS.BACKGROUND_COLOR to cssGray,
            CSS.TEXT_ALIGN to "center",
            CSS.COLOR to cssWhite,
            CSS.MAX_WIDTH to "1000px",
            CSS.MARGIN to "0 auto",

        )
        val articleSubSectionsStyle = Style(
            CSS.FONT_WEIGHT to "bold",
            CSS.FONT_SIZE to "16px",
            CSS.MARGIN to "0 auto",
            CSS.MAX_WIDTH to "1000px",
            CSS.COLOR to cssWhite
        )
        val articleSubSectionsBodyStyle = Style(
            CSS.FONT_WEIGHT to "normal",
            CSS.FONT_SIZE to "16px",
            CSS.MAX_WIDTH to "1000px",
            CSS.MARGIN to "0 auto",
            CSS.COLOR to cssWhite
        )
        val bodyStyle = Style(
            CSS.BACKGROUND_IMAGE to "url('ftl.png')",
            CSS.BACKGROUND_REPEAT to "no-repeat",
            CSS.BACKGROUND_SIZE to "cover"
        )
        val title = TitleInline("ExampleBloggers.Com").nl()
        val docType = Doctype().nl()
        val header = HeaderInline("The Serious Blogger", headerStyle).nl()
        val footer = FooterInline("© 2023 Serious Blogger",footerStyle)
        val introduction = PInline("Introduction:",articleSubSectionsStyle).nl()
        val secondSection = PInline("Understanding the Cosmic Speed Limit:",articleSubSectionsStyle).nl()
        val thirdSection = PInline("Altering Space-Time:",articleSubSectionsStyle).nl()
        val fourthSection = PInline("Quantum Entanglement and Quantum Tunnelling:",
            articleSubSectionsStyle).nl()
        val fifthSection = PInline("The Path Ahead - Ongoing Research and Speculation:",
            articleSubSectionsStyle).nl()
        val sixthSection = PInline("Conclusion:",articleSubSectionsStyle).nl()
        val intro = PInline(blogIntro.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val section2 = PInline(blogSection2.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val section3 = PInline(blogSection3.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val section4 = PInline(blogSection4.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val section5 = PInline(blogSection5.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val section6 = PInline(blogSection6.lt(tabs = 3),articleSubSectionsBodyStyle).lt(lines = 2)
        val blogTitle = DivInline(H2Inline("The Quest for Faster-Than-Light Travel: " +
                "Breaking the Cosmic Speed Limit").nl(),articleTitleStyle).nl()
        val article = ArticleInline(
            "\n"+blogTitle+ introduction+ intro+ Br()+ secondSection+ section2+
                    Br()+ thirdSection+ section3+ Br()+ fourthSection+ section4+ Br()+ fifthSection+ section5+ Br()+
                    sixthSection+ section6,
            Style(
                CSS.BACKGROUND_COLOR to cssTransparentBlack70,
                CSS.MAX_WIDTH to "1050px",
                CSS.MARGIN to "0 auto",
                CSS.BORDER_RADIUS to "10px",
                CSS.BORDER to "1px solid $cssWhite",
                CSS.PADDING_BOTTOM to "10px"
            )
        ).nl()
        val body = BodyInline("\n"+article,bodyStyle).nl()
        append(docType,title,header,Br()+body+Br(),footer)
    }
    saveHTML(page ,"blog")
}
