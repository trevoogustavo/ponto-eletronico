package com.gustavo.pontoeletronico.response

data class Response<T> (
        val erros: ArrayList<String> =  arrayListOf(),
        var data: T? = null
)
