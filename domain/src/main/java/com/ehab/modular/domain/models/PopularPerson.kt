package com.ehab.modular.domain.models

 open  class PopularPerson(
     var name :String?,
     var id : Int? ,
     var gender:Byte?,
     var known_for_department :String?,
     var profile_path:String?,
     var popularity :Float?,
     var adult :Boolean?
 )