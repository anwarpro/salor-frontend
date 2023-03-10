package com.musafira2z.store.web.ui.components

import androidx.compose.runtime.Composable
import com.musafira2z.store.web.ui.utils.toClasses
import org.jetbrains.compose.web.ExperimentalComposeWebSvgApi
import org.jetbrains.compose.web.svg.Path
import org.jetbrains.compose.web.svg.Svg

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun RxCross2(
    clas: String? = null
) {
    Svg(attrs = {
        attr("width", "15")
        attr("height", "15")
        attr("viewBox", "0 0 15 15")
        attr("fill", "none")
        attr("xmlns", "http://www.w3.org/2000/svg")
        clas?.let {
            toClasses(it)
        }
    }) {
        Path(
            attrs = {
                attr("fill-rule", "evenodd")
                attr("clip-rule", "evenodd")
                attr("fill", "currentColor")
            },
            d = "M11.7816 4.03157C12.0062 3.80702 12.0062 3.44295 11.7816 3.2184C11.5571 2.99385 11.193 2.99385 10.9685 3.2184L7.50005 6.68682L4.03164 3.2184C3.80708 2.99385 3.44301 2.99385 3.21846 3.2184C2.99391 3.44295 2.99391 3.80702 3.21846 4.03157L6.68688 7.49999L3.21846 10.9684C2.99391 11.193 2.99391 11.557 3.21846 11.7816C3.44301 12.0061 3.80708 12.0061 4.03164 11.7816L7.50005 8.31316L10.9685 11.7816C11.193 12.0061 11.5571 12.0061 11.7816 11.7816C12.0062 11.557 12.0062 11.193 11.7816 10.9684L8.31322 7.49999L11.7816 4.03157Z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun Plus(
    clas: String? = null
) {
    Svg(attrs = {
        attr("width", "15")
        attr("height", "15")
        attr("viewBox", "0 0 15 15")
        attr("fill", "none")
        attr("xmlns", "http://www.w3.org/2000/svg")
        clas?.let {
            toClasses(it)
        }
    }) {
        Path(
            attrs = {
                attr("fill", "currentColor")
                attr("fill-rule", "evenodd")
                attr("clip-rule", "evenodd")
            },
            d = "M8 2.75C8 2.47386 7.77614 2.25 7.5 2.25C7.22386 2.25 7 2.47386 7 2.75V7H2.75C2.47386 7 2.25 7.22386 2.25 7.5C2.25 7.77614 2.47386 8 2.75 8H7V12.25C7 12.5261 7.22386 12.75 7.5 12.75C7.77614 12.75 8 12.5261 8 12.25V8H12.25C12.5261 8 12.75 7.77614 12.75 7.5C12.75 7.22386 12.5261 7 12.25 7H8V2.75Z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun Minus(
    clas: String? = null
) {
    Svg(attrs = {
        attr("width", "15")
        attr("height", "15")
        attr("viewBox", "0 0 15 15")
        attr("fill", "none")
        attr("xmlns", "http://www.w3.org/2000/svg")
        clas?.let {
            toClasses(it)
        }
    }) {
        Path(
            attrs = {
                attr("fill", "currentColor")
                attr("fill-rule", "evenodd")
                attr("clip-rule", "evenodd")
            },
            d = "M2.25 7.5C2.25 7.22386 2.47386 7 2.75 7H12.25C12.5261 7 12.75 7.22386 12.75 7.5C12.75 7.77614 12.5261 8 12.25 8H2.75C2.47386 8 2.25 7.77614 2.25 7.5Z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun CaretRight() {
    Svg(attrs = {
        attr("width", "24")
        attr("height", "24")
        attr("viewBox", "0 0 15 15")
        attr("fill", "none")
        attr("xmlns", "http://www.w3.org/2000/svg")
    }) {
        Path(
            attrs = {
                attr("fill-rule", "evenodd")
                attr("clip-rule", "evenodd")
                attr("fill", "currentColor")
            },
            d = "M6.18194 4.18185C6.35767 4.00611 6.6426 4.00611 6.81833 4.18185L9.81833 7.18185C9.90272 7.26624 9.95013 7.3807 9.95013 7.50005C9.95013 7.6194 9.90272 7.73386 9.81833 7.81825L6.81833 10.8182C6.6426 10.994 6.35767 10.994 6.18194 10.8182C6.0062 10.6425 6.0062 10.3576 6.18194 10.1819L8.86374 7.50005L6.18194 4.81825C6.0062 4.64251 6.0062 4.35759 6.18194 4.18185Z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun CaretDown() {
    Svg(attrs = {
        attr("width", "15")
        attr("height", "15")
        attr("viewBox", "0 0 15 15")
        attr("fill", "none")
        attr("xmlns", "http://www.w3.org/2000/svg")
    }) {
        Path(
            attrs = {
                attr("fill-rule", "evenodd")
                attr("clip-rule", "evenodd")
                attr("fill", "currentColor")
            },
            d = "M4.18179 6.18181C4.35753 6.00608 4.64245 6.00608 4.81819 6.18181L7.49999 8.86362L10.1818 6.18181C10.3575 6.00608 10.6424 6.00608 10.8182 6.18181C10.9939 6.35755 10.9939 6.64247 10.8182 6.81821L7.81819 9.81821C7.73379 9.9026 7.61934 9.95001 7.49999 9.95001C7.38064 9.95001 7.26618 9.9026 7.18179 9.81821L4.18179 6.81821C4.00605 6.64247 4.00605 6.35755 4.18179 6.18181Z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun OutlineLogin() {
    Svg(attrs = {
        attr("xmlns", "http://www.w3.org/2000/svg")
        classes("icon")
        attr("viewBox", "0 0 1024 1024")
        attr("width", "16")
        attr("height", "16")
    }) {
        Path(
            d = "M521.7 82c-152.5-.4-286.7 78.5-363.4 197.7-3.4 5.3.4 12.3 6.7 12.3h70.3c4.8 0 9.3-2.1 12.3-5.8 7-8.5 14.5-16.7 22.4-24.5 32.6-32.5 70.5-58.1 112.7-75.9 43.6-18.4 90-27.8 137.9-27.8 47.9 0 94.3 9.3 137.9 27.8 42.2 17.8 80.1 43.4 112.7 75.9 32.6 32.5 58.1 70.4 76 112.5C865.7 417.8 875 464.1 875 512c0 47.9-9.4 94.2-27.8 137.8-17.8 42.1-43.4 80-76 112.5s-70.5 58.1-112.7 75.9A352.8 352.8 0 0 1 520.6 866c-47.9 0-94.3-9.4-137.9-27.8A353.84 353.84 0 0 1 270 762.3c-7.9-7.9-15.3-16.1-22.4-24.5-3-3.7-7.6-5.8-12.3-5.8H165c-6.3 0-10.2 7-6.7 12.3C234.9 863.2 368.5 942 520.6 942c236.2 0 428-190.1 430.4-425.6C953.4 277.1 761.3 82.6 521.7 82zM395.02 624v-76h-314c-4.4 0-8-3.6-8-8v-56c0-4.4 3.6-8 8-8h314v-76c0-6.7 7.8-10.5 13-6.3l141.9 112a8 8 0 0 1 0 12.6l-141.9 112c-5.2 4.1-13 .4-13-6.3z"
        )
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun OutlineHelp() {
    Svg(attrs = {
        attr("xmlns", "http://www.w3.org/2000/svg")
        attr("viewBox", "0 0 24 24")
        attr("width", "24")
        attr("height", "24")
    }) {
        Path(
            d = "M11 18H13V16H11V18M12 6C9.8 6 8 7.8 8 10H10C10 8.9 10.9 8 12 8S14 8.9 14 10C14 12 11 11.8 11 15H13C13 12.8 16 12.5 16 10C16 7.8 14.2 6 12 6M19 5V19H5V5H19M19 3H5C3.9 3 3 3.9 3 5V19C3 20.1 3.9 21 5 21H19C20.1 21 21 20.1 21 19V5C21 3.9 20.1 3 19 3Z"
        )
    }
}








