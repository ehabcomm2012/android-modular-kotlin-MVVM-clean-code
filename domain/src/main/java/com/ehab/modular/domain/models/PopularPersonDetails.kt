package com.ehab.modular.domain.models

 class PopularPersonDetails :PopularPerson() {
    var birthday :String?=null
     var biography :String?=null
     var place_of_birth :String?=null
     var also_known_as :List<String>?=null
}