package com.ebay.tool.thinmodelgen.gui.menu.export

import com.ebay.nst.NSTServiceModelBase
import org.json.JSONObject
import org.testng.asserts.SoftAssert

class TestKotlin(jsonRoot: JSONObject, softAssert: SoftAssert) :
    NSTServiceModelBase(jsonRoot, softAssert) {

    override fun validate(softAssert: SoftAssert) {

    }
}