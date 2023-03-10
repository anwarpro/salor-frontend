package com.musafira2z.store.web.ui.components.shared

import androidx.compose.runtime.Composable
import com.musafira2z.store.LoginCustomerMutation
import com.musafira2z.store.RegisterCustomerMutation
import com.musafira2z.store.ui.app.AppContract
import com.musafira2z.store.utils.ResponseResource
import com.musafira2z.store.web.ui.components.LoginModal
import com.musafira2z.store.web.ui.components.OutlineHelp
import com.musafira2z.store.web.ui.utils.toClasses
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.name
import org.jetbrains.compose.web.dom.*

@Composable
fun TopAppBar(
    isLoggedIn: Boolean,
    loginResponse: ResponseResource<LoginCustomerMutation.TokenCreate?>,
    signupResponse: ResponseResource<RegisterCustomerMutation.AccountRegister?>,
    postInput: (AppContract.Inputs) -> Unit
) {
    Nav(attrs = {
        classes("bg-slate-100", "p-6", "sticky", "top-0", "z-50")
    }) {
        Div(attrs = {
            classes("flex", "justify-between", "items-center", "gap-2")
        }) {
            Div(attrs = {
                classes("flex", "justify-between", "items-center", "lg:w-2/4", "gap-2")
            }) {
                Div(attrs = {}) {
                    A(attrs = {

                    }, href = "/") {
                        Img(
                            attrs = {
                                classes("w-32")
                            },
                            src = "https://musafir-js.netlify.app/static/media/saleor.e3167593a90392533db60c416b8e1883.svg",
                            alt = ""
                        )
                    }
                }
                Div(attrs = {
                    classes("hidden", "w-3/6", "lg:block", "xl:block")
                }) {
                    SearchBox()
                }
            }
            Div(attrs = {
                classes("lg:w-1/3", "xl:w-1/3", "hidden", "lg:block", "xl:block", "md:block")
            }) {
                Div(attrs = {
                    classes("flex", "justify-end", "items-center", "gap-2")
                }) {
                    Div(attrs = {
                        classes("flex", "items-center")
                    }) {
                        Img(attrs = {
                            classes("w-auto", "h-8")
                        }, src = "https://shatkora.co/playstore.webp", alt = "")

                    }
                    Div(attrs = {
                        classes("flex", "items-center")
                    }) {
                        Img(attrs = {
                            classes("w-auto", "h-8")
                        }, src = "https://shatkora.co/ios-store.png", alt = "")

                    }

                    Div(
                        attrs = {
                            toClasses("flex items-center justify-center")
                        }
                    ) {
                        A {
                            Div(attrs = {
                                toClasses("w-32 flex items-center")
                            }) {
                                OutlineHelp()
                                P(attrs = {
                                    classes("pl-2")
                                }) {
                                    Text("Need help")
                                }
                            }
                        }
                    }
                }
            }

            Div(attrs = {
                classes("flex", "justify-between", "items-center", "lg:w-72", "gap-1")
            }) {
                Div {

                }
                Div {
                    if (isLoggedIn) {
                        UserMenus(postInput = postInput)
                    } else {
                        LoginModal(
                            postInput = postInput,
                            loginResponse = loginResponse,
                            isLoggedIn = isLoggedIn,
                            signUpResponse = signupResponse
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun UserMenus(
    postInput: (AppContract.Inputs) -> Unit
) {
    Div(attrs = {
        classes("flex", "items-center", "ml-3")
    }) {
        Div {
            Button(attrs = {
                attr("type", "button")
                classes(
                    "flex",
                    "text-sm",
                    "bg-gray-800",
                    "rounded-full",
                    "focus:ring-4",
                    "focus:ring-gray-300",
                    "dark:focus:ring-gray-600"
                )
                attr("aria-expanded", "false")
                attr("data-dropdown-toggle", "dropdown-user")
            }) {
                Span(attrs = {
                    classes("sr-only")
                }) {
                    Text("Open user menu")
                }
                Img(
                    attrs = {
                        classes("w-8", "h-8", "rounded-full")
                    },
                    src = "https://flowbite.com/docs/images/people/profile-picture-5.jpg",
                    alt = "user photo"
                )
            }
        }
        Div(attrs = {
            classes(
                "z-50",
                "hidden",
                "my-4",
                "text-base",
                "list-none",
                "bg-white",
                "divide-y",
                "divide-gray-100",
                "rounded",
                "shadow",
                "dark:bg-gray-700",
                "dark:divide-gray-600"
            )
            id("dropdown-user")
        }) {
            Div(attrs = {
                classes("px-4", "py-3")
                attr("role", "none")
            }) {
                P(attrs = {
                    classes("text-sm", "text-gray-900", "dark:text-white")
                    attr("role", "none")
                }) {
                    Text(" Neil Sims ")
                }
                P(attrs = {
                    classes(
                        "text-sm",
                        "font-medium",
                        "text-gray-900",
                        "truncate",
                        "dark:text-gray-300"
                    )
                    attr("role", "none")
                }) {
                    Text(" neil.sims@flowbite.com ")

                }

            }
            Ul(attrs = {
                classes("py-1")
                attr("role", "none")
            }) {
                Li {
                    A(attrs = {
                        classes(
                            "block",
                            "px-4",
                            "py-2",
                            "text-sm",
                            "text-gray-700",
                            "hover:bg-gray-100",
                            "dark:text-gray-300",
                            "dark:hover:bg-gray-600",
                            "dark:hover:text-white"
                        )
                        attr("role", "menuitem")
                    }, href = "#") {
                        Text("Dashboard")
                    }
                }
                Li {
                    A(attrs = {
                        classes(
                            "block",
                            "px-4",
                            "py-2",
                            "text-sm",
                            "text-gray-700",
                            "hover:bg-gray-100",
                            "dark:text-gray-300",
                            "dark:hover:bg-gray-600",
                            "dark:hover:text-white"
                        )
                        attr("role", "menuitem")
                    }, href = "#") {
                        Text("Settings")
                    }

                }
                Li {
                    A(attrs = {
                        classes(
                            "block",
                            "px-4",
                            "py-2",
                            "text-sm",
                            "text-gray-700",
                            "hover:bg-gray-100",
                            "dark:text-gray-300",
                            "dark:hover:bg-gray-600",
                            "dark:hover:text-white"
                        )
                        attr("role", "menuitem")
                    }, href = "#") {
                        Text("Earnings")

                    }

                }
                Li {
                    A(attrs = {
                        onClick {
                            postInput(AppContract.Inputs.SignOut)
                        }
                        classes(
                            "block",
                            "px-4",
                            "py-2",
                            "text-sm",
                            "text-gray-700",
                            "hover:bg-gray-100",
                            "dark:text-gray-300",
                            "dark:hover:bg-gray-600",
                            "dark:hover:text-white"
                        )
                        attr("role", "menuitem")
                    }, href = "#") {
                        Text("Sign out")

                    }

                }

            }
        }
    }
}

@Composable
fun SearchBox() {
    Div(attrs = {
        classes("flex")
    }) {
        Label(attrs = {
            classes("relative", "block", "grow")
        }, forId = "") {
            P(attrs = {
                classes(
                    "absolute",

                    "p-1", "px-2", "left-2",

                    "top-1.5",


                    "flex", "items-center",

                    "rounded-lg",

                    "bg-slate-100", "text-green-500",

                    "font-bold", "select-none"
                )
            }) {
                Text(" Grocery ")
            }

            Input(InputType.Text) {
                classes(
                    "placeholder:italic",
                    "placeholder:text-slate-400",

                    "placeholder:text-xs",
                    "block",
                    "bg-white",
                    "w-full",
                    "border",
                    "border-slate-300",
                    "rounded-md",
                    "rounded-r-none",
                    "py-3",
                    "pl-24",
                    "pr-3",
                    "shadow-sm",
                    "focus:outline-none",
                    "focus:border-green-500",
                    "focus:ring-green-500",
                    "focus:ring-1",
                    "sm:text-sm",
                )
                attr("placeholder", "Search your Product from hear")
                name("search")
            }
        }
        Button(attrs = {
            classes(
                "bg-green-500",
                "hover:opacity-75",
                "w-32",
                "text-slate-50",
                "rounded-lg",
                "rounded-l-none"
            )
        }) {
            Text(" Search")
        }
    }
}

