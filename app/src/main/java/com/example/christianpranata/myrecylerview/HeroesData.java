package com.example.christianpranata.myrecylerview;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Saitama", "Saitama (サイタマ, Saitama) is the main protagonist of One-Punch Man and the most powerful being to exist in the series. Saitama faces a self-imposed existential crisis, as he is now too powerful to gain any thrill from battle.", "https://vignette.wikia.nocookie.net/onepunchman/images/0/07/Saitama_serious_profile.png/revision/latest/scale-to-width-down/310?cb=20161002154538"},
            {"Genos", "Genos (ジェノス, Jenosu) is the deuteragonist of One-Punch Man. He is a 19-year-old cyborg and the disciple of Saitama. He is always aiming to become more powerful and fights for justice. Under the Hero Association, he is given the name Demon Cyborg (鬼サイボーグ, Oni Saibōgu) and is currently S-Class Rank 14.", "@https://vignette.wikia.nocookie.net/onepunchman/images/6/69/Genos_profile_anime.png/revision/latest/scale-to-width-down/310?cb=20161002155041"},
            {"Metal Bat", "Metal Bat is a young man with black hair styled in a pompadour, and dark eyes that emphasize his hot temper. He wears black bontan pants and a black gakuran, which he drapes over his red long-sleeved turtleneck sweater.", "https://vignette.wikia.nocookie.net/onepunchman/images/e/e5/Metal_Bat_Colored.png/revision/latest/scale-to-width-down/310?cb=20170525182716"},
            {"Mumen Rider", "Mumen Rider is a young man of average height and weight. He wears an armored suit, with brown armor covering his torso and shoulders. He has a black leather suit under the armor and black gauntlets and knee pads. He also has a green bicycle helmet and dark-shaded goggles. Underneath his helmet and shades, he has short, brown hair and oval-shaped glasses that obscure his eyes.", "https://vignette.wikia.nocookie.net/onepunchman/images/3/37/License-lessRiderAnimeAvi.png/revision/latest?cb=20160207195325"},
            {"Wild Tiger", "Kotetsu T. Kaburagi (鏑木・T・虎徹), aka Wild Tiger (ワイルドタイガー) is one of the series' main protagonists and a veteran hero whose lack of regard for collateral damage when fighting crime had earned him the nickname the Crusher for Justice for the wrong reasons by the public. He starts the series as one of the least popular heroes of Sternbild City, but he seems to care more about helping the people of the city rather than earning ratings, points, or fame, a trait many seem to disapprove of.", "https://vignette.wikia.nocookie.net/tigerbunny/images/9/9e/Kotetsu-dbl.jpg/revision/latest/scale-to-width-down/300?cb=20110704221008"},
            {"Origami Cyclone", "Ivan Karelin (イワン・カレリン), alias Origami Cyclone (折紙サイクロン), is a hero who wears a kabuki themed ninja/samurai inspired costume. At first Ivan mostly appears in the background of photos and broadcasts to please his sponsors. As the show continues Ivan decides to be a more active hero even though he feels his powers aren't made for combat. He assists in evacuations, makes sure the citizens are safe, and actively participates in taking down criminals with his weapons and martial arts.", "https://vignette.wikia.nocookie.net/tigerbunny/images/8/83/Origami-dbl.jpg/revision/latest/scale-to-width-down/300?cb=20110705184533"},
            {"Kazuma Torizuna", "Kazuma is one to not think before he acts, but this proves to be false. He does think, but rather quickly. Kazuma is also known to be headstrong, a trait that causes he and Ryuho to be bitter rivals. He claims he doesn't have a last name on multiple occasions. Kazuma has a unbreakable will and he has proven that under no circumstances will he ever give up or admit defeat. He is also incredibly rebellious and hates the thought of being controlled by anyone. Although he claims to be a selfish Alter user who will do anything for the right price, this is not true as he will challenge any foe and fight against odds to protect innocent people without hesitation, especially the ones he cares for, even at the cost of his life.", "https://vignette.wikia.nocookie.net/scryed/images/3/3b/KazumaNormal.jpg/revision/latest/scale-to-width-down/250?cb=20120511213532"},
            {"Straight Cougar", "Straight Cougar, in conjunction with his alter power, is a speed demon. His carefree and fun attitude is a sharp contrast to the more serious members of HOLY as he seems to annoy most of them with his constant trouble remembering names. Cougar is friendly and outgoing, but his crush on Mimori Kiryu remains unrequited. He also seems to get offended when he is called slow or he feels something is challenging his speed.", "https://vignette.wikia.nocookie.net/scryed/images/5/5f/Cougar.jpg/revision/latest/scale-to-width-down/250?cb=20100727053340"},
            {"Yusuke Urameshi", "Yusuke Urameshi (浦飯 幽助, Urameshi Yūsuke) is the main protagonist of the manga and anime series YuYu Hakusho. He is a Spirit Detective who is tasked with protecting Human World from various supernatural threats over the course of the series and his closest friends as well as greatest allies include Kuwabara, Kurama, Hiei, Keiko, Genkai, Koenma and Botan. He is also the de facto leader of Team Urameshi and the general person to look to when the going gets tough.", "https://vignette.wikia.nocookie.net/yuyuhakusho/images/1/17/Vlcsnap-2011-03-17-23h21m11s35.jpg/revision/latest?cb=20110318042203"},
            {"Samurai Flamenco", "Masayoshi Hazama is a male model who decides to follow his childhood dream of becoming a superhero known as Samurai Flamenco. He has had a love for tokusatsu shows since he was a child, which came from his grandfather. It was his grandfather who invented his suit.", "https://vignette.wikia.nocookie.net/samurai-flamenco/images/1/1b/Samurai-flamenco-1.jpg/revision/latest?cb=20131023185049"},
    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }

        return list;
    }
}

