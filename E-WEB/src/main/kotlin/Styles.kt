class CSS(val value: String) {
    companion object {
        val ALIGN_CONTENT = CSS("align-content")
        val ALIGN_ITEMS = CSS("align-items")
        val ALIGN_SELF = CSS("align-self")
        val BACKGROUND = CSS("background")
        val BACKGROUND_COLOR = CSS("background-color")
        val BACKGROUND_IMAGE = CSS("background-image")
        val BACKGROUND_REPEAT = CSS("background-repeat")
        val BACKGROUND_SIZE = CSS("background-size")
        val BORDER = CSS("border")
        val BORDER_BOTTOM = CSS("border-bottom")
        val BORDER_LEFT = CSS("border-left")
        val BORDER_RIGHT = CSS("border-right")
        val BORDER_TOP = CSS("border-top")
        val BORDER_TOP_LEFT_RADIUS =CSS("border-top-left-radius")
        val BORDER_TOP_RIGHT_RADIUS =CSS("border-top-right-radius")
        val BORDER_BOTTOM_LEFT_RADIUS =CSS("border-bottom-left-radius")
        val BORDER_BOTTOM_RIGHT_RADIUS =CSS("border-bottom-right-radius")
        val BORDER_RADIUS = CSS("border-radius")
        val BOX_SHADOW = CSS("box-shadow")
        val COLOR = CSS("color")
        val DISPLAY = CSS("display")
        val GAP = CSS("gap")
        val FLEX = CSS("flex")
        val FLEX_DIRECTION = CSS("flex-direction")
        val FLEX_GROW = CSS("flex-grow")
        val FLEX_SHRINK = CSS("flex-shrink")
        val FLEX_WRAP = CSS("flex-wrap")
        val FLOAT = CSS("float")
        val FONT_FAMILY = CSS("font-family")
        val FONT_SIZE = CSS("font-size")
        val FONT_STYLE = CSS("font-style")
        val FONT_WEIGHT = CSS("font-weight")
        val HEIGHT = CSS("height")
        val JUSTIFY_CONTENT = CSS("justify-content")
        val LETTER_SPACING = CSS("letter-spacing")
        val LINE_HEIGHT = CSS("line-height")
        val LIST_STYLE = CSS("list-style")
        val MARGIN = CSS("margin")
        val MARGIN_BOTTOM = CSS("margin-bottom")
        val MARGIN_LEFT = CSS("margin-left")
        val MARGIN_RIGHT = CSS("margin-right")
        val MARGIN_TOP = CSS("margin-top")
        val MAX_HEIGHT = CSS("max-height")
        val MAX_WIDTH = CSS("max-width")
        val MIN_HEIGHT = CSS("min-height")
        val MIN_WIDTH = CSS("min-width")
        val OPACITY = CSS("opacity")
        val ORDER = CSS("order")
        val OUTLINE = CSS("outline")
        val OUTLINE_COLOR = CSS("outline-color")
        val OUTLINE_STYLE = CSS("outline-style")
        val OUTLINE_WIDTH = CSS("outline-width")
        val OVERFLOW = CSS("overflow")
        val PADDING = CSS("padding")
        val PADDING_BOTTOM = CSS("padding-bottom")
        val PADDING_LEFT = CSS("padding-left")
        val PADDING_RIGHT = CSS("padding-right")
        val PADDING_TOP = CSS("padding-top")
        val POSITION = CSS("position")
        val TEXT_ALIGN = CSS("text-align")
        val TEXT_DECORATION = CSS("text-decoration")
        val TEXT_TRANSFORM = CSS("text-transform")
        val TOP = CSS("top")
        val RIGHT = CSS("right")
        val BOTTOM = CSS("bottom")
        val LEFT = CSS("left")
        val TRANSFORM = CSS("transform")
        val TRANSITION = CSS("transition")
        val VERTICAL_ALIGN = CSS("vertical-align")
        val VISIBILITY = CSS("visibility")
        val WHITE_SPACE = CSS("white-space")
        val WIDTH = CSS("width")
        val WORD_BREAK = CSS("word-break")
        val WORD_SPACING = CSS("word-spacing")
        val Z_INDEX = CSS("z-index")
    }
}

fun Style(vararg args: Pair<CSS, String>): String {
    var style = ""
    val myMap = args.toMap()
    for (entry in myMap) {
        style += "${entry.key.value}: ${entry.value}; "
    }
    return "style=\"${style.trim()}\""
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

