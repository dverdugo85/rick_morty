package com.betterfly.test.ui.model

import java.io.Serializable
///Objeto con la información del origen
class itemOrigin : Serializable {
    lateinit var url :String
    lateinit var name :String
    constructor() {}
    constructor(name: String,url :String) {
        this.url=url
        this.name = name
    }
}