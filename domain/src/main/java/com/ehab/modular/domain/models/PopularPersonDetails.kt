package com.ehab.modular.domain.models

 data class PopularPersonDetails(
     var birthday :String?,
     var biography :String?,
     var place_of_birth :String?,
     var also_known_as :List<String>?,
 ) :PopularPerson() {}