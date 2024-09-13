import java.util.*;
public class Music{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1:
            Lover lover = new Lover();
            break;
            case 2:
            Daylight daylight = new Daylight();
            break;
            case 3:
            AnoNa ano = new AnoNa();
            break;
            case 4:
            IkawLang ikaw = new IkawLang();
            break;
            case 5:
            Pano pano = new Pano();
            break;
            case 6:
            IsaLang isa = new IsaLang();
            break;
            case 7:
            NeedYou need = new NeedYou();
            break;
            case 8:
            Sanctuary sanctuary = new Sanctuary();
            break;
            case 9:
            DoubleTake doubletake = new DoubleTake();
            break;
            case 10:
            TieMeDown tiemedown = new TieMeDown();
            break;
            default:
                break;
        }
    }
}
class Lover{
    Lover(){
        String[] Lyrics = {
            "We could leave the Christmas lights up 'til January",
            "And this is our place, we make the rules",
            "And there's a dazzling haze, a mysterious way about you dear",
            "Have I known you 20 seconds or 20 years?",
            "Can I go where you go?",
            "Can we always be this close forever and ever?",
            "And ah, take me out, and take me home",
            "You're my, my, my, my",
            "Lover",
            "We could let our friends crash in the living room",
            "This is our place, we make the call",
            "And I'm highly suspicious that everyone who sees you wants you",
            "I've loved you three summers now, honey, but I want 'em all",
            "Can I go where you go?",
            "Can we always be this close forever and ever?",
            "And ah, take me out, and take me home (forever and ever)",
            "You're my, my, my, my",
            "Lover",
            "Ladies and gentlemen, will you please stand?",
            "With every guitar string scar on my hand",
            "I take this magnetic force of a man to be my lover",
            "My heart's been borrowed and yours has been blue",
            "All's well that ends well to end up with you",
            "Swear to be overdramatic and true to my lover",
            "And you'll save all your dirtiest jokes for me",
            "And at every table, I'll save you a seat, lover",
            "Can I go where you go?",
            "Can we always be this close forever and ever?",
            "And ah, take me out, and take me home (forever and ever)",
            "You're my, my, my, my",
            "Oh, you're my, my, my, my",
            "Darling, you're my, my, my, my",
            "Lover"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Daylight{
    Daylight(){
        String[] Lyrics = {
            "My love was as cruel as the cities I lived in",
            "Everyone looked worse in the light",
            "There are so many lines that I've crossed unforgiven",
            "I'll tell you the truth, but never goodbye",
            "I don't wanna look at anything else now that I saw you",
            "I don't wanna think of anything else now that I thought of you",
            "I've been sleeping so long in a 20-year dark night",
            "And now I see daylight, I only see daylight",
            "Luck of the draw only draws the unlucky",
            "And so I became the butt of the joke",
            "I wounded the good and I trusted the wicked",
            "Clearing the air, I breathed in the smoke",
            "Maybe you ran with the wolves and refused to settle down",
            "Maybe I've stormed out of every single room in this town",
            "Threw out our cloaks and our daggers because it's morning now",
            "It's brighter now, now",
            "I don't wanna look at anything else now that I saw you",
            "(I can never look away)",
            "I don't wanna think of anything else now that I thought of you",
            "(Things will never be the same)",
            "I've been sleeping so long in a 20-year dark night",
            "(Now I'm wide awake)",
            "And now I see daylight (Daylight), I only see daylight (Daylight)",
            "I only see daylight, daylight, daylight, daylight",
            "I only see daylight, daylight, daylight, daylight",
            "And I can still see it all (In my mind)",
            "All of you, all of me (Intertwined)",
            "I once believed love would be (Black and white)",
            "But it's golden (Golden)",
            "And I can still see it all (In my head)",
            "Back and forth from New York (Sneaking in your bed)",
            "I once believed love would be (Burning red)",
            "But it's golden",
            "Like daylight, like daylight",
            "Like daylight, daylight",
            "I don't wanna look at anything else now that I saw you",
            "(I can never look away)",
            "I don't wanna think of anything else now that I thought of you",
            "(Things will never be the same)",
            "I've been sleeping so long in a 20-year dark night",
            "(Now I'm wide awake)",
            "And now I see daylight (I see daylight), I only see daylight (Ah)",
            "I only see daylight, daylight, daylight, daylight",
            "I only see daylight, daylight, daylight, daylight (Ah)",
            "I only see daylight, daylight, daylight, daylight",
            "I only see daylight, daylight, daylight, daylight",
            "Like daylight",
            "It's golden like daylight",
            "You gotta step into the daylight and let it go",
            "Just let it go, let it go",
            "I wanna be defined by the things that I love",
            "Not the things I hate",
            "Not the things that I'm afraid of, I'm afraid of",
            "Not the things that haunt me in the middle of the night",
            "I, I just think that",
            "You are what you love"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class AnoNa{
    AnoNa(){
        String[] Lyrics = {
            "Weeeee",
            "Pew pew pew pew",
            "Pe memew mew pew pew",
            "Pew pew pew",
            "Sa pag gising ko tila himig mo ang bungad ng araw ko",
            "Pag mulat ng mata jusko eto may muta pa ako ugh",
            "Teka ano na nga ba san na ba papunta",
            "Lungkot nang buhay ko'y talagang grabe na",
            "Hanggang saan ba aabot ang panaginip ko",
            "Sa isang babaeng umaalon ang kanyang buhok",
            "Para bang gusto ko na tumakas talaga sa",
            "Isang bangungot na binuo ko nang mag isa",
            "Habang ako'y papatulog na dapat na ng mahimbing",
            "Ako'y nappraning at napapailing sa",
            "Mga bagay na iniisip ko sa tuwing ako'y nababato",
            "Bakit ganto naninigas ang ulo ko",
            "Tumayo nalang bigla ang aking buhok tila ba parang",
            "May isang babae na nakatayo sa sulok",
            "At di na makalagaw ang aking",
            "Nararamdamdam na para bang may humahaplos na",
            "Sa aking tiyan",
            "Kasabay nitoy hawak ko na ang isang mainit na uhhh isang tasang kape",
            "Bakit ganto ba pre hindi mapakali sa",
            "Tuwing ako'y nag iisa wala na akong pake",
            "Para kang bahaghari",
            "Sa liwanag iyong nadali",
            "Kung hindi ikaw ang pinangako mabuti nalang na maging isang pari",
            "Sa kamandag na taglay ay grabe",
            "Walang sinabe mga babae, sa karilagan, kapag dumaan",
            "Kasalanan ko nanaman dahil naakit",
            "Sapula mo na labi sana nakatitig ka sa'kin palagi",
            "At sa pagdilat sa umaga tinig mo ang panggising sa'kin",
            "Na parang pelikula, di na kaylangan mag cinema",
            "Ikaw ang buong istorya, sabay boses mo ang nagsisillbi na musika",
            "Sining sa museo na tanging diyos lamang ang nagpinta",
            "Nakita kita naparang anghel, para sakin at di sa iba",
            "Ang hirap na magbida, ang isa na extra",
            "Sa litrato na 'di para sa kanya",
            "Wala na ko masabi",
            "Ayoko na hahaha",
            "Ba-bye na po!"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class IkawLang{
    IkawLang(){
        String[] Lyrics = {
            "Oh, kay gandang pagmasdan",
            "Ang iyong mga mata",
            "Kumikinang-kinang",
            "'Di ko maintindihan",
            "Ang iyong mga tingin",
            "Labis ang mga ningning",
            "Langit ay bumaba",
            "Bumababa pala ang tala",
            "Tumingin ka sa 'king mga mata",
            "At hindi mo na kailangan pang",
            "Magtanong nang paulit-ulit",
            "Ikaw lang ang iniibig",
            "At kung 'di kumbinsido'y magtiwala ka",
            "Hawakan ang puso't maniwala",
            "Na ikaw lang ang s'yang inibig",
            "Ikaw lang ang iibigin",
            "At sa iyong paglalambing",
            "Ako ay nahulog din",
            "'Di ko alam kung ano ang gagawin",
            "'Di ko alam kung saan titingin",
            "Halik sa labi",
            "Tinginan natin",
            "'Di akalaing",
            "Mahuhulog ka sa 'kin",
            "Tumingin ka sa aking mga mata",
            "At hindi mo na kailangan pang",
            "Magtanong nang paulit-ulit",
            "Ikaw lang ang iniibig",
            "At kung 'di kumbinsido'y magtiwala ka",
            "Hawakan ang puso't maniwala",
            "Na ikaw lang ang s'yang inibig",
            "Ikaw lang ang iibigin, sinta",
            "At sa paglisan ng araw, akala'y 'di ka mahal",
            "At ang nadarama'y hindi magtatagal",
            "Malay ko bang hindi magpapagal",
            "Iibigin kita kahit ga'no pa katagal",
            "Tumingin ka sa 'king mga mata",
            "At hindi mo na kailangan pang",
            "Magtanong nang paulit-ulit",
            "Ikaw lang ang iniibig",
            "At kung 'di kumbinsido'y magtiwala ka",
            "Hawakan ang puso't maniwala",
            "Na ikaw lang ang s'yang inibig",
            "Ikaw lang ang iibigin",
            "La-la-la-la-la-la, la-la-la",
            "La-la-la-la-la-la, la-la-la",
            "La-la-la-la (ah)",
            "La-la-la-la (ah)",
            "La-la-la-la-la-la, la-la-la",
            "Siya lang, la-la, la-la-la",
            "La-la-la-la (ah)",
            "La-la-la-la (ah)",
            "Sinta"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Pano{
    Pano(){
        String[] Lyrics = {
            "Oh giliw naririnig mo ba",
            "Ang yong sarili",
            "Nakakabaliw lumalabas",
            "Sa yong bibig",
            "Alam kong uto uto ako",
            "Alam ko na marupok",
            "Tao lang din naman",
            "Kasi ako",
            "May nararamdaman din ako",
            "Di kasi manhid na tulad mo",
            "Alam kong sanay bumitaw",
            "Ang isang tulad mo",
            "Lalayo na ba ako",
            "Pano naman ako",
            "Nahulog na sayo",
            "Binitawan mo lang ba talaga ako",
            "Pano naman ako",
            "Naghintay ng matagal sayo",
            "Wala lang ba talaga lahat ng yon sayo",
            "Ano na bang gagawin ko",
            "Sinasadya mo ba ang lahat",
            "O trip mo lang ba ako saktan",
            "Pagtapos kong ibigay balikat ko",
            "Pag ika'y umiiyak",
            "Ano bang tingin mo saakin",
            "Isa ba akong alipin",
            "Wala ka bang modo",
            "Anong ginawa mo",
            "Nagtiwala naman sayo",
            "May nararamdaman din ako",
            "Di kasi manhid na tulad mo",
            "Alam kong sanay bumitaw",
            "Ang isang tulad mo",
            "Lalayo na ba ako",
            "Pano naman ako",
            "Nahulog na sayo",
            "Binitawan mo lang ba talaga ako",
            "Pano naman ako",
            "Naghintay ng matagal sayo",
            "Wala lang ba talaga lahat ng yon sayo",
            "Ano na bang gagawin ko",
            "Pano naman ako",
            "Nahulog na sayo",
            "Binitawan mo lang ba talaga ako",
            "Pano naman ako",
            "Naghintay ng matagal sayo",
            "Wala lang ba talaga lahat ng yon sayo",
            "Ano na bang gagawin ko"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class IsaLang{
    IsaLang(){
        String[] Lyrics = {
            "Hmm oh (oh)",
            "Hmm pag-usapan muna natin ang iyong gabi",
            "Ikaw ang pahinga ko mahal",
            "Lumiliwanag aking ngiti",
            "Kapag kausap na",
            "Kita pasensya lang kung",
            "Babalik pa rin sa atin",
            "Kahit 'di mo 'ko hanapin",
            "Magpapaalipin lang sa 'yo",
            "Pinapawi mo ang uhaw ng aking puso",
            "Oh sabik sa lalim",
            "Ng pagtingin mo para sa 'kin",
            "'Pag napansin mo na ako",
            "Ipapaunawa ko agad sa 'yo na",
            "Isa lang isa lang (isa lang)",
            "Ang hinahanap ko hanap ko (hanap)",
            "Ikaw ra man ikaw ra man",
            "Kung papalarin na mapapasa'kin ba",
            "Kung saan-saan man magtungo 'di alam kung ba't sa puso",
            "Pangalan mo lang ang tanging laman",
            "Hindi alam kung ba't mas sinusunod mo pa ang iyong mga tala",
            "At 'di ang nararamdaman sa akin ngunit",
            "Babalik pa rin sa atin",
            "Kahit 'di mo 'ko hanapin",
            "Magpapa-alipin lang sa 'yo",
            "Pinapawi mo ang uhaw ng aking puso",
            "Oh sabik sa lalim",
            "Ng pagtingin mo para sa 'kin",
            "'Pag napansin mo na ako",
            "Ipapaunawa ko agad sa 'yo na",
            "Isa lang isa lang (isa lang)",
            "Ang hinahanap ko hanap ko",
            "Ikaw ra man ikaw ra man",
            "Kung papalarin na mapapasa'kin ba",
            "Kung mang-aakit akit ka na naman",
            "Pwede bang sa akin akin lang",
            "Kung mang-aakit akit ka na naman",
            "Pwede bang sa akin akin lang",
            "Kung mang-aakit akit ka na naman",
            "Pwede bang sa akin akin lang",
            "Isa lang isa lang",
            "Ang hinahanap ko hanap ko",
            "Ikaw ra man ikaw ra man",
            "Kung papalarin na mapapasa'kin ba"
        };
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class NeedYou{
    NeedYou(){
        String[] Lyrics = {
            "I just want your body, baby, 'lika na",
            "'Di na ako galit, baby, uwi ka na",
            "Hinihintay kita dito kanina pa",
            "I just want your body right na-na-na",
            "I just want your body, body, body",
            "I just want your body on me, on me",
            "I just want your body, body, body",
            "Come a little closer to me",
            "I just want your body, baby, 'lika na",
            "'Di na ako galit, baby, uwi ka na",
            "Hinihintay kita dito kanina pa",
            "I just want your body right na-na-na",
            "I just want your body, your body, your body",
            "I'll be grindin' on your booty, your booty, your booty",
            "I just wanna feel your body, your body, your body",
            "Fuck you right in my bed, lemme ride on you, baby",
            "Aye, li'l baby, ginawa mo sa 'kin lately",
            "Para bang ako'y naguguluhan, magalit man pero, baby",
            "I just want more of you, your body is my cure",
            "Magalit man pero, baby, 'di ka iiwan, that's for sure",
            "Kanina pa kita hinihintay",
            "Nananabik na mahawakan ang kamay mo",
            "Baby, I wanna feel your body on me, on me",
            "We gon' fuck tonight",
            "Dahil gusto ko lang makasama ka at makayakap ka",
            "'Wag mong ipagkait sa akin, baby, 'lika na",
            "Gusto ko lang naman ang lambing mo",
            "'Di na 'ko galit, halika na dito",
            "Won't you come home to me, yeah?",
            "Can you be my remedy, yeah?",
            "Baby, just do whatever I say",
            "Sa 'yong halik, ako ay okay na, yeah",
            "I just want your body, body, body",
            "I just want your body on me, on me",
            "I just want your body, body, body",
            "Come a little closer to me",
            "I just want your body, baby, 'lika na",
            "'Di na ako galit, baby, uwi kana",
            "Hinihintay kita dito kanina pa",
            "I just want your body right na-na-na",
            "Nasaan ka na ba? Dadaanan na kita, sabay tayong umuwi",
            "At 'wag nang magtampo, 'lika sa 'kin tumabi, lumalalim ang gabi",
            "'Di na ako mapakali ('di na ako mapakali) Nasaan ka ba?",
            "Ako'y kanina pang tumatawag kasi sobrang miss kita",
            "Isuot mo na ang iyong thong, paki-play ng sexiest song",
            "Sabay fuck, hipak na sa bong bago mag bale-balentong",
            "Hanggang 'di na maalala mga galit ko, sabik na madama ulit ang kapit mo",
            "Gusto nang madampian ulit ang labi mo at magsamang painitin natin ang gabing ito",
            "Nasa'n ka na ba? Hinihintay na kita",
            "Ayos na lahat, pwede na magkalat, umuwi ka na, miss na kita",
            "Alam mo ba na nakakainis ka, sino bang nagsabing umalis ka?",
            "Kaya please umuwi ka na, bilis na, kasi this time, miss ko na i-kiss ka",
            "I'm gonna kiss you in your forehead, I'm gonna do my best",
            "Down to your chest, just say yes, obvious na kung ano'ng next",
            "Hanggang sa kama ka mabitbit, yayapusin ka nang mahigpit",
            "Kung saan masikip ako'y sisiksik habang labi mo sinisipsip",
            "Sa ganyang paraan ko ipapadama ang iyong halaga",
            "Kaligayahan na 'di ko pa pinatikim sa iba",
            "Basta ngayon kailangan kita, hangga't maaga pa, umuwi ka na nga",
            "Ang lahat ng kailangan ni-ready ko na, sa silid ko ay ikukulong na kita",
            "I just want your body, body, body",
            "I just want your body on me, on me",
            "I just want your body, body, body",
            "Come a little closer to me",
            "I just want your body, baby, 'lika na",
            "'Di na ako galit, baby, uwi ka na",
            "Hinihintay kita dito kanina pa",
            "I just want your body right na-na-na",
            "I just want your body, your body, your body",
            "I'll be grindin' on your booty, your booty, your booty",
            "I just wanna feel your body, your body, your body",
            "Fuck you right in the bed, lemme ride on you, baby",
            "Baby girl, nasaan ka na? 'Lika na dito, tara",
            "Kanina pa ako nag-aantay sa 'yo kaya umuwi ka na, ha?",
            "Gusto na kitang kasama kahit na isang gabi",
            "Mapadama mo lang ang init sa 'kin sandali",
            "'Wag ka na mag-alala, mas mabuti magpakasaya",
            "Kapit ka nang mahigpit, ano man ang mangyari, 'wag kang maingay sa iba",
            "Simpleng galit lang 'to, kailangan ko lambing mo",
            "Alam mo na kung ano'ng dapat gawin mo kapag sinarado pinto",
            "Masyadong malungkot kapag wala ka sa tabi",
            "Nasa'n ka na ba? Ba't 'di ka pa umuuwi",
            "Alam mo bang halos ako sa 'yo'y mangonsume",
            "Minsan nababaliw na sa mga sabi-sabi",
            "Pero 'di ko na patatagalin 'to, pwedeng alisin mo kung ano man lahat ng inis ko",
            "Pwedeng bang pa-kiss o payakap naman, isa lang lahat kasi nami-miss ko",
            "Painitin natin ang gabi, 'lika dito sa aking tabi",
            "Sapul lahat ano mang parte, dahan-dahan, walang hapdi",
            "I just want your body, your body, your body",
            "I'll be grindin' on your booty, your booty, your booty",
            "I just wanna feel your body, your body, your body",
            "Fuck you right in my bed, lemme ride on you, baby",
            "I just want your body, body, body",
            "I just want your body on me, on me",
            "I just want your body, body, body",
            "Come a little closer to me",
            "I just want your body, baby, 'lika na",
            "'Di na ako galit, baby, uwi ka na",
            "Hinihintay kita dito kanina pa",
            "I just want your body right na-na-na"
        };
        
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Sanctuary{
    Sanctuary(){
        String[] Lyrics = {
            "Go ahead and bark after dark",
            "Fallen star, I'm your one call away",
            "Motel halls, neon walls",
            "When night falls, I am your escape",
            "When you lay alone, I ache",
            "Something I wanted to feel",
            "If you've been waiting for fallin' in love",
            "Babe, you don't have to wait on me",
            "'Cause I've been aiming for heaven above",
            "But an angel ain't what I need",
            "Not anyone, you're the one",
            "More than fun, you're the sanctuary",
            "'Cause what you want is what I want",
            "Sincerity",
            "Souls that dream alone lie awake",
            "I'll give you something so real",
            "If you've been waiting for fallin' in love",
            "Babe, you don't have to wait on me",
            "'Cause I've been aiming for heaven above",
            "But an angel ain't what I need",
            "Pull me, oh, so close",
            "'Cause you never know",
            "Just how long our lives will be",
            "If you've been waiting for fallin' in love",
            "Babe, you don't have to wait on me",
            "'Cause I've been aiming for heaven above",
            "But an angel ain't what I need"
        };
        
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DoubleTake{
    DoubleTake(){
        String[] Lyrics = {
            "I could say I never dare",
            "To think about you in that way, but",
            "I would be lyin'",
            "And I pretend I'm happy for you",
            "When you find some dude to take home",
            "But I won't deny that",
            "In the midst of the crowds",
            "In the shapes in the clouds",
            "I don't see nobody but you",
            "In my rose-tinted dreams",
            "Wrinkled silk on my sheets",
            "I don't see nobody but you",
            "Boy, you got me hooked onto something",
            "Who could say that they saw us coming?",
            "Tell me",
            "Do you feel the love?",
            "Spend a summer or a lifetime with me",
            "Let me take you to the place of your dreams",
            "Tell me",
            "Do you feel the love?",
            "And I could say I never unzipped",
            "Those blue Levi's inside my head",
            "But that's far from the truth",
            "Don't know what's come over me",
            "It seems like yesterday when I said",
            "\"We'll be friends forever\"",
            "Constellations of stars",
            "Murals on city walls",
            "I don't see nobody but you",
            "You're my vice, you're my muse",
            "You're a nineteenth floor view",
            "I don't see nobody but you",
            "Boy, you got me hooked onto something",
            "Who could say that they saw us coming?",
            "Tell me",
            "Do you feel the love?",
            "Spend a summer or a lifetime with me",
            "Let me take you to the place of your dreams",
            "Tell me",
            "Do you feel the love?",
            "Boy, you got me hooked onto something",
            "Who could say that they saw us coming?",
            "Tell me",
            "Do you feel the love?",
            "Spend a summer or a lifetime with me",
            "Let me take you to the place of your dreams",
            "Tell me",
            "Do you feel the love?",
            "Do you feel the love?",
            "Do you feel the love?",
            "Do you feel the love?",
            "Do you feel the love?",
            "Feel the love",
            "Do you feel the love?"
        };
        
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TieMeDown{
    TieMeDown(){
        String[] Lyrics = {
            "Don't lie, I know you've been thinking it",
            "And two times, you let it slip from your lips",
            "You've got too much pride to make any promises",
            "Thinking that we got time, and you want to keep it in",
            "I want you out in the pouring rain",
            "I want you down on your knees",
            "Praying to God that I feel the same",
            "I'm right here, baby, so please",
            "Hold me up, tie me down",
            "'Cause I never wanna leave your side",
            "Swear to never let you down",
            "And it's been eating me alive",
            "You can take me home",
            "You can never let me go",
            "Hold me up, hold me up",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "Nine lives until you fall at my feet",
            "Don't hide, you're wasting your energy",
            "You're not shy, so baby, it's useless",
            "So don't try, 'cause you'll end up losin' it",
            "I want you out in the pouring rain",
            "I want you down on your knees",
            "Praying to God that I feel the same",
            "I'm right here, baby, so please",
            "Hold me up, tie me down",
            "'Cause I never wanna leave your side",
            "Swear to never let you down",
            "And it's been eating me alive",
            "You can take me home",
            "You can never let me go",
            "Hold me up, hold me up",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "So wrap your arms around my chest",
            "And I'll put my hands around your neck",
            "'Cause nobody wins these waiting games",
            "You push and you pull, but you should stay",
            "Stay",
            "Hold me up, tie me down",
            "'Cause I never wanna leave your side",
            "Swear to never let you down",
            "And it's been eating me alive",
            "You can take me home",
            "You can never let me go",
            "Hold me up, hold me up",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "And tie me, tie me down, down (down)",
            "And tie me, tie me down, down",
            "Down, down"
        };
        
        try {
            for (String line : Lyrics){
                for(int i = 0; i < line.length(); i++){
                    System.out.print(line.charAt(i));
                    Thread.sleep(80);
                }
            System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}