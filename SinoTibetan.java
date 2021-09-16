/*
This a child class of Language modeled after the Sino-Tibetan language family.
*/

class SinoTibetan extends Language {
    
    
    SinoTibetan(String languageName, int speakers) {
        
        super(languageName, speakers, "Asia", "subject-object-verb");
        if (languageName.contains("Chinese")) {
                            
            this.wordOrder = "subject-verb-object";
        
        }
    }
}

