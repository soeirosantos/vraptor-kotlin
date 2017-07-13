package com.todevornot.bestprice.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Path;

@Controller
open class HomeController {

    @Inject
    private lateinit var result: Result

    @Path("/hello")
    open fun index() = result.include("message", "Hello, Kotlin...")

}