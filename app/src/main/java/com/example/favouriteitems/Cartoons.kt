package com.example.favouriteitems

data class Cartoons(var title:String,var url:String)   //used data class as this class is being used for creating cartoons' data only and no other operations
object Supplier{            //singleton class as we need only one instance of list of cartoons in the entire application
    var cartoons= listOf<Cartoons>(
        Cartoons("Doremon","https://en.wikipedia.org/wiki/Doraemon"),
        Cartoons("Sin chan","https://en.wikipedia.org/wiki/Crayon_Shin-chan"),
        Cartoons("Kitaresu","https://en.wikipedia.org/wiki/Kiteretsu_Daihyakka#:~:text=Released,April%201974%20to%20July%201977."),
        Cartoons("Hagemaru","https://en.wikipedia.org/wiki/Tsurupika_Hagemaru"),
        Cartoons("Tom and Jerry","https://en.wikipedia.org/wiki/Tom_and_Jerry"),
        Cartoons("Bandbudh aur Burbak","https://en.wikipedia.org/wiki/Bandbudh_Aur_Budbak"),
        Cartoons("Bablu Dablu","https://en.wikipedia.org/wiki/Boonie_Bears"),
        Cartoons("Pokemon","https://en.wikipedia.org/wiki/Pok%C3%A9mon_(anime)"),
        Cartoons("The Yogi Bear Show","https://en.wikipedia.org/wiki/The_Yogi_Bear_Show"),
        Cartoons(" The Huckleberry Hound Show","https://en.wikipedia.org/wiki/The_Huckleberry_Hound_Show"),
        Cartoons("Popeye the Sailor ","https://en.wikipedia.org/wiki/Popeye"),
        Cartoons("The Bugs Bunny Show","https://en.wikipedia.org/wiki/The_Bugs_Bunny_Show"),
        Cartoons("The Road Runner Hour","https://en.wikipedia.org/wiki/The_Road_Runner_Show"),
        Cartoons("The Sylvester & Tweety, Daffy & Speedy Show","https://en.wikipedia.org/wiki/The_Sylvester_%26_Tweety_Mysteries"),
        Cartoons("The Bugs Bunny and Tweety Show","https://en.wikipedia.org/wiki/The_Bugs_Bunny_Show"),
        Cartoons("The Sylvester & Tweety Show","https://en.wikipedia.org/wiki/The_Sylvester_%26_Tweety_Mysteries"),
        Cartoons("The Pink Panther Show ","https://en.wikipedia.org/wiki/The_Pink_Panther_Show"),
        Cartoons("The Atom Ant Show","https://en.wikipedia.org/wiki/Atom_Ant"),
        Cartoons("Wacky Races","https://en.wikipedia.org/wiki/Wacky_Races_(1968_TV_series)"),
        Cartoons("Duck Dodgers","https://en.wikipedia.org/wiki/Duck_Dodgers_(TV_series)"),
        Cartoons("Shaggy & Scooby-Doo Get a Clue!","https://en.wikipedia.org/wiki/Shaggy_%26_Scooby-Doo_Get_a_Clue!"),
        Cartoons("The Ri¢hie Ri¢h/Scooby-Doo Show","https://en.wikipedia.org/wiki/The_Richie_Rich/Scooby-Doo_Show"),
        Cartoons("House of Mouse","https://en.wikipedia.org/wiki/House_of_Mouse"),
        Cartoons("George of the Jungle","https://en.wikipedia.org/wiki/George_of_the_Jungle_(film)"),
        Cartoons("The Magic School Bus","https://en.wikipedia.org/wiki/The_Magic_School_Bus"),
        Cartoons("Dora the Explorer","https://en.wikipedia.org/wiki/Dora_the_Explorer"),
        Cartoons("The Backyardigans","https://en.wikipedia.org/wiki/The_Backyardigans"),
        Cartoons("Little Einsteins","https://en.wikipedia.org/wiki/Little_Einsteins"),
        Cartoons("Postman Pat","https://en.wikipedia.org/wiki/Postman_Pat"),
        Cartoons("Peppa Pig","https://en.wikipedia.org/wiki/Peppa_Pig"),
        Cartoons("Ben & Holly's Little Kingdom","https://en.wikipedia.org/wiki/Ben_%26_Holly%27s_Little_Kingdom"),
        Cartoons("Wonder Pets!","https://en.wikipedia.org/wiki/Wonder_Pets!"),
        Cartoons("Odd Squad","https://en.wikipedia.org/wiki/Odd_Squad_(TV_series)")
    )
}