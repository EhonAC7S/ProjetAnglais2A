package com.example.englishproject.courses.dataelement;

/*
 * Created by jorda on 27/04/2017.
 *
 */
import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * DataBase of all Courses that can be Displayed and referenced
 */
public class DataBaseCourses extends SQLiteOpenHelper{
    //Ici on met les constantes des noms de nos Cours
    public static final String COMMON_MISSPELLINGS = "Common Misspellings"; // A virer
    public static final String SUFFIXES = "Suffixes";
    public static final String APOSTROPHES_FOR_POSSESSION = "Apostrophes for possession";
    public static final String THOUGH_THOUGHT_THOROUGH_THROUGH = "though/thought/thorough/through";
    public static final String NEGATIVE_PREFIXES = "Negative Prefixes";
    public static final String ACTIVE_VOICE = "Active Voice"; // Fait
    public static final String PASSIVE_VOICE = "Passive Voice"; // Fait
    public static final String CONJUNCTIONS = "Conjunctions"; // Fait
    public static final String COMMA = "Comma"; // Fait
    public static final String SEMICOLON = "Semicolon"; // Fait
    public static final String SIMPLE_PRESENT = "Simple Present"; // Fait
    public static final String PRESENT_PROGRESSIVE = "Present Progressive"; // Fait
    public static final String ED_RULE = "-ed rule"; // Fait
    public static final String PRESENT_PERFECT = "Present Perfect"; // Fait
    public static final String PRESENT_PERFECT_PROG = "Present Perfect Progressive";// Fait
    public static final String PAST_PERFECT = "Past Perfect"; // Fait
    public static final String FORMING_PLURALS = "Forming Plural"; // Fait
    public static final String THEIR_THERE_THEYRE = "Their/There/They re";// Fait
    public static final String HOMOPHONES = "Homophones"; // A virer

    // STRING FOR DATACALL
    private static final String CREATE_TABLE_IF_NOT_EXISTS = "CREATE TABLE IF NOT EXISTS ";
    private static final String INTEGER_PRIMARY_KEY_AUTOINCREMENT = " INTEGER PRIMARY KEY AUTOINCREMENT, ";
    private static final String SELECT_FROM = "SELECT * FROM ";
    private static final String TEXT = " TEXT, ";
    private static final String WHERE = " WHERE ";
    private static final String BIGTAB = "      ";
    private static final String TAB = "   ";
    private static final String LINEJUMP = "\n";
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Courses";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCR = "descr";
    private static final String KEY_EX1 = "example1";
    private static final String KEY_RULE = "rule";
    private static final String KEY_EX2 ="example2";

    private SQLiteDatabase dbase;
    public DataBaseCourses(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        System.out.println("On est dans le OnCreate()");

        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);

        String sql = CREATE_TABLE_IF_NOT_EXISTS + DATABASE_NAME + " ( "
                + KEY_ID + INTEGER_PRIMARY_KEY_AUTOINCREMENT + KEY_RULE + TEXT +KEY_TITLE + TEXT
                + KEY_DESCR +TEXT+ KEY_EX1 +TEXT+ KEY_EX2 +" TEXT)";
        db.execSQL(sql);
        addCourses();

        //db.close();

    }
    private void addCourses()
    {
        //Ajouter les contenus des cours ici
        //template :
        //addCourse(new CourseContents(
        //      RULE, // Rule
        //      TITLE, // Title
        //      DESCRIPTION, // Desc
        //      EXAMPLE1, // Example1
        //      EXAMPLE2) // Example2
        //);

        // COMMON_MISSPELLINGS :
        addCourse(new CourseContents(
                COMMON_MISSPELLINGS, // Rule
                THEIR_THERE_THEYRE, // Title
                THEIR_THERE_THEYRE, // Desc
                THEIR_THERE_THEYRE, // Example1
                THEIR_THERE_THEYRE) // Example2
        );
        // SUFFIXES
        addCourse(new CourseContents(
                SUFFIXES, // Rule
                THEIR_THERE_THEYRE, // Title
                THEIR_THERE_THEYRE, // Desc
                THEIR_THERE_THEYRE, // Example1
                THEIR_THERE_THEYRE) // Example2
        );
        // APOSTROPHES_FOR_POSSESSION
        addCourse(new CourseContents(
                APOSTROPHES_FOR_POSSESSION, // Rule
                THEIR_THERE_THEYRE, // Title
                THEIR_THERE_THEYRE, // Desc
                THEIR_THERE_THEYRE, // Example1
                THEIR_THERE_THEYRE) // Example2
        );
        // THOUGH_THOUGHT_THOROUGH_THROUGH
        addCourse(new CourseContents(
                THOUGH_THOUGHT_THOROUGH_THROUGH, // Rule
                THEIR_THERE_THEYRE, // Title
                THEIR_THERE_THEYRE, // Desc
                THEIR_THERE_THEYRE, // Example1
                THEIR_THERE_THEYRE) // Example2
        );
        // NEGATIVE_PREFIXES
        addCourse(new CourseContents(
                NEGATIVE_PREFIXES, // Rule
                "Which prefixe in the list : 'in-, un-, non-, de-, dis-, a-, anti-, im-, il-, and ir-'", // Title
                TAB + "The most common negative prefixes in English are in-, un-, non-, de-, dis-, a-, anti-, im-, il-, and ir-. " +
                        "While some of these prefixes are interchangeable in some uses, there are subtle differences between them.\n\n" +
                        BIGTAB + "The in- prefix (from which im-, il-, and ir- are derived) is generally the least useful of the negative prefixes, " +
                        "as it only goes with certain Latin-derived stems (e.g., intolerant, inarticulate, impenetrable), is highly conventionalized, " +
                        "and is identical to morphemes used in words that are not negative" + LINEJUMP +LINEJUMP +
                        BIGTAB + "The un- prefix is commonly attached to Latin derivatives that end in suffixes such as -ed and -able, resulting " +
                        "in adjectives such as unfounded, unassailable, and unbelievable." + LINEJUMP + LINEJUMP +
                        BIGTAB + "The prefix non- is the most useful negative prefix, as it can be attached to virtually any noun, verb, adjective, " +
                        "or adverb and is not confusable with other common morphemes. Unlike in-, and un-, which often create nonabsolute negatives, " +
                        "non- is generally used to create a word that describes the complete opposite of its nonnegative form. In other words, " +
                        "for example, a nonconformist is someone who absolutely does not conform. If we were to coin the nouns uncomformist and " +
                        "inconformist, they wouldn’t have the same sense." + LINEJUMP + "When affixing non- to a word, no hyphen is needed unless " +
                        "the stem is a proper noun. Spell-checkers might catch any unhyphenated non- words you invent, but this doesn’t mean your " +
                        "coinages are incorrect." + LINEJUMP + LINEJUMP +
                        "The prefix de- is usually affixed to verbs to denote reversal of an action. The prefix dis- is similar in some uses to de- " +
                        "and in other uses to un-. A- is affixed to adjectives ending in -al. Anti- means against.", // Desc
                "unable, inability, (to) disable, unable, unacknowledged, nonconformist or nonconformity", // Example1
                "illegal, illegible, illiterate, illogical, immature, disable/ disabled/ disability, disagree, " +
                        "deactivate, decode, decommission, decompose ") // Example2
        );
        // ACTIVE_VOICE
        addCourse(new CourseContents(
                ACTIVE_VOICE, // Rule
                "Active Voice Usage", // Title
                TAB + "Someone (the subject) is doing something (the verb). The subject performs the action.\n Active Voice can add impact to your writing", // Desc
                "We are going to watch a movie tonight.", // Example1
                "Mom read the novel in one day.") // Example2
        );
        // PASSIVE_VOICE
        addCourse(new CourseContents(
                PASSIVE_VOICE, // Rule
                "Focus on the action", // Title
                TAB + "Someone (the subject) is having something (the verb) done to them. The subject receives the action", // Desc
                "She had been murdered.", // Example1
                "Everyone was startled by the power outage.") // Example2
        );
        // CONJUNCTIONS
        addCourse(new CourseContents(
                CONJUNCTIONS, // Rule
                "To coordinate clauses", // Title
                TAB + "Sometimes you want to link two ideas with a second S+V+O combination. " +
                        "When you do, you need a coordinating conjunction.\n " +
                        TAB + "Coordinating conjunctions are easy to remember with an acronymic mnemonic device: FANBOYS : \n" +
                        "For-And-Nor-But-Or-Yet-So", // Desc
                "She hasn't taken dance lessons, nor does she need to.", // Example1
                "Other dancers try to imitate her style, yet they have not succeeded.") // Example2
        );
        // COMMA
        addCourse(new CourseContents(
                COMMA, // Rule
                "Serial Comma for listing", // Title
                TAB + "The serial, or Oxford, comma is a controversial rule of grammar. Some want to eliminate it " +
                        "altogether while others just don't know how to use it." +
                        TAB + "The serial comma is the last comma in a list, usually appearing before 'and.'\n" +
                        TAB + "Commas separate units in a list. In the above case, each unit only has one part, so it's easy. " +
                        "Where people get confused is when the units are bigger\n" +
                        TAB + "Notice that the serial comma comes before 'and' but not the last 'and' in the sentence. " +
                        "The 'and' that follows the comma is only there because it sounds better. Grammatically, " +
                        "'and' is irrelevant. Only units matter.",
                "Pets are Us has lizards, dogs, and birds.",
                "Pets are Us has lizards and frogs, dogs and cats, and parakeets and macaws.") // Example2
        );
        // SEMICOLON
        addCourse(new CourseContents(
                SEMICOLON, // Rule
                "Close connection, two as one!", // Title
                TAB + "A list of grammar rules has to include the scariest of punctuation marks. It might look funny, " +
                        "but don't be afraid of the semicolon; it's the easiest thing in the world to use! " +
                        TAB + "Say you want to join two ideas but can't figure out or can't be bothered to use a " +
                        "coordinating conjunction. The two ideas can be separate sentences," +
                        " but you think that they are so closely connected; they really should be one. " +
                        "Use a semicolon.", // Desc
                "Mary's dog is hyperactive; it won't stop barking or sit still.",
                "My heart is like a cup of Lapsang Souchong tea; it's bitter and smoky.") // Example2
        );
        // SIMPLE_PRESENT
        addCourse(new CourseContents(
                SIMPLE_PRESENT, // Rule
                "Habitual Actions", // Title
                TAB + "The simple present is the tense you use for any habitual action. " +
                        "The things you always do or do every Tuesday are described with " +
                        "the simple present, which just means you pick the first form of any verb.", // Desc
                "Mary likes dogs.", // Example1
                "Mary is playing with her hyperactive dog.")  // Example2
        );
        // PRESENT_PROGRESSIVE
        addCourse(new CourseContents(
                PRESENT_PROGRESSIVE,
                "Tense for current action",
                TAB + "The present progressive tense is for anything that is happening right now. " +
                        "All of the progressive tenses are easy to spot because their verbs always " +
                        "end with '-ing' and get a helping verb. " +
                        TAB + "A helping verb is just so we know who and when we're talking about. " +
                        TAB + "In the present progressive, the helping verbs are the present tense " +
                        "conjugations of 'to be.'",
                "I am drinking Lapsang Souchong tea.",
                "Mary is playing with her hyperactive dog.")
        );
        // ED_RULE
        addCourse(new CourseContents(
                ED_RULE,
                "Past tense for regular verbs",
                TAB + "When we talk about the past, we have to add an '-ed' to regular verbs to make the second form. " +
                        TAB + "Irregular verbs are tricky and have their own sets of rules. Drink, for example, turns to 'drank.' " +
                        TAB + "Most of the time, though, '-ed' will do.",
                "The dogs stopped barking two seconds ago, and I am feeling better.",
                "Mary played fetch with her hyperactive dog.")
        );
        // PRESENT_PERFECT
        addCourse(new CourseContents(
                PRESENT_PERFECT,
                "The Unfinished Past",
                TAB + "The present perfect can be confusing for some, but it is one of the most important rules of grammar. " +
                        TAB + "When people talk about things that have already happened but consider the time in which they " +
                        "occurred to be unfinished, " +
                        "they use the third form of the verb with a helping verb. The helping verb for the present perfect " +
                        "is the present tense conjugation of 'to have.'",
                "I have drunk three cups of Lapsang Souchong tea today.",
                "Mary has walked her hyperactive poodle 100 times this week.")
        );
        // PRESENT_PERFECT_PROG
        addCourse(new CourseContents(
                PRESENT_PERFECT_PROG,
                "The Unfinished Actions of Past",
                TAB + "When the action as well as the time is considered unfinished, the verb loads up on third " +
                        "form helping verbs ('to be' and 'to have') and changes to the progressive form.",
                "Western countries have been waging wars in the Middle East for thousands of years.",
                "I have been drinking tea all day.")
        );
        // PAST_PERFECT
        addCourse(new CourseContents(
                PAST_PERFECT,
                "Past for Past in the Past",
                TAB + "When two things happen in the past, we have to mark which one happened first. " +
                        "The one that happened first changes to third form and gets the helping verb, 'had.'",

                "By the time I drank one cup of Lapsang Souchong, Mary's dog had barked a million times.",
                "I had not yet eaten breakfast when Mary walked her dog.")
        );
        // FORMING_PLURALS
        addCourse(new CourseContents(
                FORMING_PLURALS,
                "Plural of noun",
                TAB + "There is many rule, you have to choose the appropriate one : \n" +
                        BIGTAB + "1) Add -s to most nouns." + LINEJUMP +
                        BIGTAB + "2) Add -es to nouns ending is s, x, z, ch, or sh." + LINEJUMP +
                        BIGTAB + "3) For nouns ending in y preceded by a consonant, change y to i and add es." + LINEJUMP +
                        BIGTAB + "4) For nouns ending in y preceded by a vowel, add s. " + LINEJUMP +
                        BIGTAB + "5) For nouns ending in f or fe, usually change the f or fe to ves" + LINEJUMP +
                        BIGTAB + "6) Add s to the end of singular nouns ending in ful" + LINEJUMP +
                        BIGTAB + "7) Add s to the most important noun in a hyphenated word.",
                "With these rules : Boy, boys - Brush, brushes - Hero, heroes - Piano, pianos - Lady, ladies - Shelf, shelves",
                "Some exceptions : " + LINEJUMP + BIGTAB +
                        "Foot (singular), feet (plural)\n" + BIGTAB +
                        "Man, men\n" + BIGTAB +
                        "Woman, women\n" + BIGTAB +
                        "Tooth, teeth\n" + BIGTAB +
                        "Mouse, mice\n" + BIGTAB +
                        "Goose, geese")
        );
        // THEIR_THERE_THEYRE
        addCourse(new CourseContents(
                THEIR_THERE_THEYRE,
                "Homophone : There/Their/They're",
                TAB + "THERE : There is the opposite of Here. It means 'in that place' not here. " +
                        "There is/There are = to show that something exists.\n\n" +
                        TAB + "THEIR : Their is a possessive adjective which is used before a noun. " +
                        "It shows possession, that something belongs to them.\n\n" +
                        TAB + "THEY'RE : They're is a simple contraction of they are.",
                "They're playing their video games over there.",
                "All of their friends were crazy.")
        );



    }

    public CourseContents getCourseContents(String rule) {
        String selectQuery = SELECT_FROM + DATABASE_NAME + WHERE + KEY_RULE +" = '" + rule + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        cursor.moveToFirst();
        CourseContents course = new CourseContents();
        course.setRULE(cursor.getString(1));
        course.setTitle(cursor.getString(2));
        course.setDesc(cursor.getString(3));
        course.setExemple1(cursor.getString(4));
        course.setExemple2(cursor.getString(5));
        cursor.close();
        return course;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        // Create tables again
        onCreate(db);
    }
    // Adding new sentence
    private void addCourse(CourseContents sent) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_RULE, sent.getRULE());
        values.put(KEY_TITLE, sent.getTitle());
        values.put(KEY_DESCR, sent.getDesc());
        values.put(KEY_EX1, sent.getExemple1());
        values.put(KEY_EX2, sent.getExemple2());
        // Inserting Row
        dbase.insert(DATABASE_NAME, null, values);
    }
    public ArrayList<CourseContents> getAllCourses() {
        ArrayList<CourseContents> sentList = new ArrayList<>();
        // Select All Query
        String selectQuery = SELECT_FROM + DATABASE_NAME;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
                // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                CourseContents course = new CourseContents();
                course.setRULE(cursor.getString(1));
                //System.out.println(cursor.getString(1));
                course.setTitle(cursor.getString(2));
                course.setDesc(cursor.getString(3));
                course.setExemple1(cursor.getString(4));
                course.setExemple2(cursor.getString(5));
                sentList.add(course);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return sentList;
    }

    public int rowcount()
    {
        int row;
        String selectQuery = SELECT_FROM + DATABASE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        cursor.close();
        return row;
    }
}
