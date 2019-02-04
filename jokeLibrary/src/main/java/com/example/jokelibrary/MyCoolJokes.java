package com.example.jokelibrary;


import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyCoolJokes {

   static List<String> list = asList(
            "Damn I forgot to go to the gym today. Thats 10 years in a row now... ",
            "Behind every girl’s selfie are approximately 43 nearly identical photos that just did not cut it.",
            "Organized people are simply too lazy to search for stuff.",
            "I am aware that the voices in my head are not real. But their ideas are just awesome sometimes!",
            "Today I found my first grey pubic hair. I got really excited, but not as much as the other people in the lift.",
            "If you ever see me running, run like hell too. I am far too lazy to be running without a good reason.",
            "If a man said he will fix it, he will fix it. There is no need to nag him every 6 months about it.",
            "All my life I thought air was for free. That was until I bought a bag of crisps.",
            "If somebody calls you ugly, you can just say, “You have mistaken me for your mirror again, did not you?”",
            "Monday office chat:   There are days one should really just sleep through. Like Monday through Friday."
    );

    public static String getJoke(){
        Random random = new Random();

        String randomJoke = list.get(random.nextInt(list.size()));

        return  randomJoke;
    }

}
