val ALIGN_CONTENT = "align-content"
val ALIGN_ITEMS = "align-items"
val ALIGN_SELF = "align-self"
val BACKGROUND = "background"
val BACKGROUND_COLOR = "background-color"
val BACKGROUND_IMAGE = "background-image"
val BACKGROUND_REPEAT = "background-repeat"
val BACKGROUND_SIZE = "background-size"
val BORDER = "border"
val BORDER_BOTTOM = "border-bottom"
val BORDER_LEFT = "border-left"
val BORDER_RIGHT = "border-right"
val BORDER_TOP = "border-top"
val BORDER_TOP_LEFT_RADIUS ="border-top-left-radius"
val BORDER_TOP_RIGHT_RADIUS ="border-top-right-radius"
val BORDER_BOTTOM_LEFT_RADIUS ="border-bottom-left-radius"
val BORDER_BOTTOM_RIGHT_RADIUS ="border-bottom-right-radius"
val BORDER_RADIUS = "border-radius"
val BOX_SHADOW = "box-shadow"
val COLOR = "color"
val DISPLAY = "display"
val GAP = "gap"
val FLEX = "flex"
val FLEX_DIRECTION = "flex-direction"
val FLEX_GROW = "flex-grow"
val FLEX_SHRINK = "flex-shrink"
val FLEX_WRAP = "flex-wrap"
val FLOAT = "float"
val FONT_FAMILY = "font-family"
val FONT_SIZE = "font-size"
val FONT_STYLE = "font-style"
val FONT_WEIGHT = "font-weight"
val HEIGHT = "height"
val JUSTIFY_CONTENT = "justify-content"
val LETTER_SPACING = "letter-spacing"
val LINE_HEIGHT = "line-height"
val LIST_STYLE = "list-style"
val MARGIN = "margin"
val MARGIN_BOTTOM = "margin-bottom"
val MARGIN_LEFT = "margin-left"
val MARGIN_RIGHT = "margin-right"
val MARGIN_TOP = "margin-top"
val MAX_HEIGHT = "max-height"
val MAX_WIDTH = "max-width"
val MIN_HEIGHT = "min-height"
val MIN_WIDTH = "min-width"
val OPACITY = "opacity"
val ORDER = "order"
val OUTLINE = "outline"
val OUTLINE_COLOR = "outline-color"
val OUTLINE_STYLE = "outline-style"
val OUTLINE_WIDTH = "outline-width"
val OVERFLOW = "overflow"
val PADDING = "padding"
val PADDING_BOTTOM = "padding-bottom"
val PADDING_LEFT = "padding-left"
val PADDING_RIGHT = "padding-right"
val PADDING_TOP = "padding-top"
val POSITION = "position"
val TEXT_ALIGN = "text-align"
val TEXT_DECORATION = "text-decoration"
val TEXT_TRANSFORM = "text-transform"
val TOP = "top"
val RIGHT = "right"
val BOTTOM = "bottom"
val LEFT = "left"
val TRANSFORM = "transform"
val TRANSITION = "transition"
val VERTICAL_ALIGN = "vertical-align"
val VISIBILITY = "visibility"
val WHITE_SPACE = "white-space"
val WIDTH = "width"
val WORD_BREAK = "word-break"
val WORD_SPACING = "word-spacing"
val Z_INDEX = "z-index"

fun Styles(vararg args: Pair<String, String>): String {
    var style = ""
    val myMap = args.toMap()
    for (entry in myMap) {
        style += "${entry.key}: ${entry.value}; "
    }
    return "style=\"${style.trim()}\""
}
