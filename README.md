# MadLibs
Creating a MadLib using the String Class:

Build a MadLibs using the String class. You will be able to accept keyboard input, store information, and build up your prompt to match your template with a few changes made to it. For my template I will be using: 

"I know, but I never got to say what I needed to say to you. I'm sorry. You blame me for who you are. And I'm sorry. I'm sorry that I turned you. I'm sorry that you didn't get to die as a forgotten nobody on a bloody battlefield, and your father didn't get to live another day to be disgraced by you. Damon, I'm sorry that I gave your life purpose. Passion. Drive. Desire. I'm sorry that you are who you are because I'm the one that taught you how to love."

I will be taking out some nouns, verbs, and adjectives to be replaced with my code. In order to replace these specific pieces, I will store my quote in chunked variables and use the substring(int from, int to) method to break it up, replace the missing piece and concatenate it back together. Using the length() method will be useful in getting the length of strings to properly find the substring. (This way you don't have to count everything) As you concatenate your smaller phrases back together, make sure you keep track of the total changed quote to be outputted at the end. I'll include an example in the code when it is released.