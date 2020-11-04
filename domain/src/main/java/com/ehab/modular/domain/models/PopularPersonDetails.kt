package com.ehab.modular.domain.models

  class PopularPersonDetails constructor(
      name :String?,
      id : Int? ,
      gender:Byte?,
      known_for_department :String?,
      profile_path:String?,
      popularity :Float?,
      adult :Boolean?,
     var birthday :String?,
     var biography :String?,
     var place_of_birth :String?,
     var also_known_as :List<String>?,
 ) :PopularPerson(name,id,gender,known_for_department,profile_path,popularity,adult) {}