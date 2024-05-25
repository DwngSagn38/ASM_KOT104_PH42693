package com.example.asm_kot104_ph42693.Model

class CategoryModel(
    var cateID : Int,
    var cateName : String,
    var imageCate : Int
) {
    override fun toString(): String {
        return "CategoryModel(cateID='$cateID', cateName='$cateName', imageCate=$imageCate)"
    }
}