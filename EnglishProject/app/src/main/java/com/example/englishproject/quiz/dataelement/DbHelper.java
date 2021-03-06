package com.example.englishproject.quiz.dataelement;
import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.englishproject.courses.dataelement.DataBaseCourses.*;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "quizDB";
    // tasks table name
    private static final String TABLE_SENTENCE = "sentence";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_PART1= "part1"; //option a
    private static final String KEY_PART2= "part2"; //option b
    private static final String KEY_PART3= "part3"; //option c
    private static final String KEY_RULE= "rule"; // règle

    public static final String NO_MISSPELLING = "NO MISSPELLING";

    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SENTENCE);

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_SENTENCE + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_ANSWER+ " TEXT, "+KEY_PART1 +" TEXT, "
                +KEY_PART2 +" TEXT, "+KEY_PART3 +" TEXT, "+KEY_RULE +" TEXT)";
        db.execSQL(sql);
        addSentences();
        //System.out.println(this.rowcount());
        //db.close();
    }
    private void addSentences()
    {
        Sentence q1=new Sentence("It may be possible", " to reach ", "agreemment.", "agreemment.", COMMON_MISSPELLINGS);
        this.addSentence(q1);
        Sentence q2=new Sentence("Each department must be", " treated in an ", "appropriate way.", NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q2);
        Sentence q3=new Sentence("Can I", " interupt ","you ?"," interupt ", COMMON_MISSPELLINGS);
        this.addSentence(q3);
        Sentence q4=new Sentence("What are the characteristics of successful", " bussiness ", "meetings."," bussiness ", COMMON_MISSPELLINGS);
        this.addSentence(q4);
        Sentence q5=new Sentence("The key to a successful oral"," presentations is to ","keep things simple.",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q5);

        Sentence q1bis=new Sentence("Mr Despres", " accidently ", "scheduled two classes at the same time.", " accidently ", COMMON_MISSPELLINGS);
        this.addSentence(q1bis);
        Sentence q2bis=new Sentence("The letter was returned, as the", " adress ", "was unreadable.", " adress ", COMMON_MISSPELLINGS);
        this.addSentence(q2bis);
        Sentence q3bis=new Sentence("Even though Mrs Duval is an adult, she still", " beleives ","in fairies."," beleives ", COMMON_MISSPELLINGS);
        this.addSentence(q3bis);
        Sentence q4bis=new Sentence("Uncork the wine and leave it to", " breath ", "for an hour before you serve it."," breath ", COMMON_MISSPELLINGS);
        this.addSentence(q4bis);
        Sentence q5bis=new Sentence("Her strong commitment to women's"," rights made ","her determined to continue.",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q5bis);

        Sentence q1bis2=new Sentence("It's unpractical to", " copywrite ", "clothing designs.", " copywrite ", COMMON_MISSPELLINGS);
        this.addSentence(q1bis2);
        Sentence q2bis2=new Sentence("She got some medicine that helped", " the baby's ", "diarrea.", "diarrea.", COMMON_MISSPELLINGS);
        this.addSentence(q2bis2);
        Sentence q3bis2=new Sentence("Good", " goverment ","needs vigilant citizens.","  goverment  ", COMMON_MISSPELLINGS);
        this.addSentence(q3bis2);
        Sentence q4bis2=new Sentence("The guerrillas constantly", " harrassed ", "the invaders' supply lines."," harrassed ", COMMON_MISSPELLINGS);
        this.addSentence(q4bis2);
        Sentence q5bis2=new Sentence("The new mother hemorrhaged after giving birth"," and stayed ","in the hospital for a week.",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q5bis2);

        Sentence q1bis3=new Sentence("He's enjoying his independence", " now that ", "he's single again.", NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q1bis3);
        Sentence q2bis3=new Sentence("The old church was struck by", " lightening ", "and caught fire.", " lightening ", COMMON_MISSPELLINGS);
        this.addSentence(q2bis3);
        Sentence q3bis3=new Sentence("When he retired he found he didn't", " have any ","pasttimes.","pasttimes.", COMMON_MISSPELLINGS);
        this.addSentence(q3bis3);
        Sentence q4bis3=new Sentence("I find his pronunciation really", " difficult ", "to follow.",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q4bis3);
        Sentence q5bis3=new Sentence("Which would you prefer -"," potato waffles ","or fries?",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q5bis3);

        Sentence q1bis4=new Sentence("Mr Festor made an incoherent speech to"," us that lasted ","an hour.",NO_MISSPELLING, COMMON_MISSPELLINGS);
        this.addSentence(q1bis4);


        Sentence q6=new Sentence("Pepsi is not"," dislike ","Coke."," dislike ", NEGATIVE_PREFIXES);
        this.addSentence(q6);
        Sentence q7=new Sentence("In important ways,"," the two sisters are ","very unlike.",NO_MISSPELLING, NEGATIVE_PREFIXES);
        this.addSentence(q7);
        Sentence q8=new Sentence("Taking things that aren't"," yours is ","unlegal.","unlegal.", NEGATIVE_PREFIXES);
        this.addSentence(q8);
        Sentence q9=new Sentence("It never pays to be"," inpatient ","with old people."," inpatient ", NEGATIVE_PREFIXES);
        this.addSentence(q9);
        Sentence q10=new Sentence("I'd love to help you decorate"," but I'm ","horribly impractical.",NO_MISSPELLING, NEGATIVE_PREFIXES);
        this.addSentence(q10);

        Sentence q6bis=new Sentence("The room had extra bedding"," but it was ","unecessary.","unecessary.", NEGATIVE_PREFIXES);
        this.addSentence(q6bis);
        Sentence q7bis=new Sentence("The tolerable level of error or"," mistatement ","is a matter of judgment."," mistatement ", NEGATIVE_PREFIXES);
        this.addSentence(q7bis);
        Sentence q8bis=new Sentence("Missunderstood"," children may grow into emotionally ","unhealthy adults.","Missunderstood", NEGATIVE_PREFIXES);
        this.addSentence(q8bis);
        Sentence q9bis=new Sentence("If you're dissatisfied at all, return"," the product ","for a full refund.",NO_MISSPELLING, NEGATIVE_PREFIXES);
        this.addSentence(q9bis);
        Sentence q10bis=new Sentence("It's a mistake to harvest fruit while"," it is still ","immature.",NO_MISSPELLING, NEGATIVE_PREFIXES);
        this.addSentence(q10bis);


        Sentence q11=new Sentence("The athlete made an"," extraordinery ","jump."," extraordinery ", SUFFIXES);
        this.addSentence(q11);
        Sentence q12=new Sentence("Is this shirt"," availible ","in any other colours ?"," availible ", SUFFIXES);
        this.addSentence(q12);
        Sentence q13=new Sentence("Conditioner makes my hair"," more ","manageable.",NO_MISSPELLING, SUFFIXES);
        this.addSentence(q13);
        Sentence q14=new Sentence("The book includes an"," introductory ","chapter.",NO_MISSPELLING, SUFFIXES);
        this.addSentence(q14);
        Sentence q15=new Sentence("The government was oppressive,"," and the people lived in ","misary.","misary.", SUFFIXES);
        this.addSentence(q15);

        Sentence q11bis=new Sentence("Mrs Duval had to stop and ask for some"," guideance ","before she found the restaurant."," guideance ", SUFFIXES);
        this.addSentence(q11bis);
        Sentence q12bis=new Sentence("I think it's partly due to the"," crazyness ","surrounding the latest research."," crazyness ", SUFFIXES);
        this.addSentence(q12bis);
        Sentence q13bis=new Sentence("Feelings of emptiness arose when"," he moved ","away from home.",NO_MISSPELLING, SUFFIXES);
        this.addSentence(q13bis);
        Sentence q14bis=new Sentence("When an inmate is first"," admited ","to an institution, a complete assessment is conducted."," admited ", SUFFIXES);
        this.addSentence(q14bis);
        Sentence q15bis=new Sentence("Jane preferred the spotted skirt"," to the ","striped one.",NO_MISSPELLING, SUFFIXES);
        this.addSentence(q15bis);


        Sentence q16=new Sentence("What did you and your"," partner do for ","Valentines day ?","Valentines day ?", APOSTROPHES_FOR_POSSESSION);
        this.addSentence(q16);
        Sentence q17=new Sentence("On April Fools Day"," it's traditional to play practical ","jokes on people before midday.","On April Fools Day", APOSTROPHES_FOR_POSSESSION);
        this.addSentence(q17);
        Sentence q18=new Sentence("Italy is one of the"," world's great ","wine countries.",NO_MISSPELLING, APOSTROPHES_FOR_POSSESSION);
        this.addSentence(q18);
        Sentence q19=new Sentence("November 9th is my"," parent's wedding ","anniversary."," parent's wedding ", APOSTROPHES_FOR_POSSESSION);
        this.addSentence(q19);
        Sentence q20=new Sentence("She's Britain's most"," popular TV ","gardener.",NO_MISSPELLING, APOSTROPHES_FOR_POSSESSION);
        this.addSentence(q20);


        Sentence q21=new Sentence("The police carried out a"," thorough ","search of the area.",NO_MISSPELLING, THOUGH_THOUGHT_THOROUGH_THROUGH);
        this.addSentence(q21);
        Sentence q22=new Sentence("Her words kept running"," though ","my mind."," though ", THOUGH_THOUGHT_THOROUGH_THROUGH);
        this.addSentence(q22);
        Sentence q23=new Sentence("Even though it's small,"," the room ","has a spacious feel.",NO_MISSPELLING, THOUGH_THOUGHT_THOROUGH_THROUGH);
        this.addSentence(q23);
        Sentence q24=new Sentence("He failed his exams"," thought ","not studying enough."," thought ", THOUGH_THOUGHT_THOROUGH_THROUGH);
        this.addSentence(q24);
        Sentence q25=new Sentence("The boy was"," lost in ","thought.","thought.", THOUGH_THOUGHT_THOROUGH_THROUGH);
        this.addSentence(q25);


        Sentence q26=new Sentence("The farmer cultivates bananas"," on his ","farm in Ecuador.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q26);
        Sentence q27=new Sentence("The First Lady is a member of"," one of our ","churchs.","churchs.", FORMING_PLURALS);
        this.addSentence(q27);
        Sentence q28=new Sentence("Rabbits and foxes only come out"," in the ","evening.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q28);
        Sentence q29=new Sentence("When I was a child I wanted to be a pirate like"," the ones I read about in adventure ","storys.","storys.", FORMING_PLURALS);
        this.addSentence(q29);
        Sentence q30=new Sentence("Mr Despres bought a batch of"," sock ","at the store."," sock ", FORMING_PLURALS);
        this.addSentence(q30);

        Sentence q26bis=new Sentence("Sometimes it's after only one call,"," sometimes after ","about three tries.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q26bis);
        Sentence q27bis=new Sentence("The last group was made up mainly of"," womans ","who also smoke."," womans ", FORMING_PLURALS);
        this.addSentence(q27bis);
        Sentence q28bis=new Sentence("Genetic material can be found"," in cell ","nuclei.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q28bis);
        Sentence q29bis=new Sentence("Game is very common, as are"," gooses, ","and all kinds of wild ducks."," gooses, ", FORMING_PLURALS);
        this.addSentence(q29bis);
        Sentence q30bis=new Sentence("There are some intense negotiations between potato farmers and"," chip makers over the price of ","potatos.","potatos.", FORMING_PLURALS);
        this.addSentence(q30bis);

        Sentence q26bis2=new Sentence("Men at the conference all seemed to"," have trophy ","wives.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q26bis2);
        Sentence q27bis2=new Sentence("With the first set of"," knifes ","we ran two shifts for more than a year !"," knifes ", FORMING_PLURALS);
        this.addSentence(q27bis2);
        Sentence q28bis2=new Sentence("They are two halves of the same"," whole and ","cannot be separated.",NO_MISSPELLING, FORMING_PLURALS);
        this.addSentence(q28bis2);
        Sentence q29bis2=new Sentence("Our"," lifes ","are more and more involved with science and innovation."," lifes ", FORMING_PLURALS);
        this.addSentence(q29bis2);
        Sentence q30bis2=new Sentence("Divide the pizza into"," halfs ","and then into quarters."," halfs ", FORMING_PLURALS);
        this.addSentence(q30bis2);


        Sentence q31=new Sentence("There are few data available to"," answer ","this question.",NO_MISSPELLING, THEIR_THERE_THEYRE);
        this.addSentence(q31);
        Sentence q32=new Sentence("They're ","should be no confusion between ethical ","investment funds and mutual investment funds.","They're ", THEIR_THERE_THEYRE);
        this.addSentence(q32);
        Sentence q33=new Sentence("I looked at your suggestions"," but I like ","theirs better.",NO_MISSPELLING, THEIR_THERE_THEYRE);
        this.addSentence(q33);
        Sentence q34=new Sentence("There ","still working on trusting that ","this will work.","There ", THEIR_THERE_THEYRE);
        this.addSentence(q34);
        Sentence q35=new Sentence("Their ","was disagreement over the appropriate legal ","means to pursue that objective.","Their ", THEIR_THERE_THEYRE);
        this.addSentence(q35);


        Sentence q36=new Sentence("One character of text equals one", " bite ","of data.", " bite ", BIGHT_BITE_BYTE);
        this.addSentence(q36);
        Sentence q37=new Sentence("A censor"," detects whether the lid ","is open or closed.","A censor", CENSER_CENSOR_SENSOR);
        this.addSentence(q37);
        Sentence q38=new Sentence("Hiroshima became one of the most terrible bomb"," cites ","history had ever known."," cites ", CITE_SIGHT_SITE);
        this.addSentence(q38);
        Sentence q39=new Sentence("The lifeboats are located"," for ", "and aft."," for ", FOR_FORE_FOUR);
        this.addSentence(q39);
        Sentence q40=new Sentence("Harry scraped his name into the"," dirt with his ","heal.","heal.", HEAL_HEEL_HE_LL);
        this.addSentence(q40);

        Sentence q41=new Sentence("The painter mixed colors on his"," pallet ","before painting."," pallet ", PALATE_PALETTE_PALLET);
        this.addSentence(q41);
        Sentence q42=new Sentence("Your mention of a job vacancy has really"," peeked ","my interest."," peeked ", PEAK_PEEK_PEKE_PIQUE);
        this.addSentence(q42);
        Sentence q43=new Sentence("We should not give these states"," a free ","rain.","rain.", RAIN_REIGN_REIN);
        this.addSentence(q43);
        Sentence q44=new Sentence("For the photo shoot, the band members"," all wore black ","teas.","teas.", TE_TEA_TEE);
        this.addSentence(q44);
        Sentence q45=new Sentence("She's not"," to ","eager to get involved in this."," to ", TO_TOO_TWO);
        this.addSentence(q45);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SENTENCE);
        // Create tables again
        onCreate(db);
    }
    // Adding new sentence
    private void addSentence(Sentence sent) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ANSWER, sent.getANSWER());
        values.put(KEY_PART1, sent.getPART1());
        values.put(KEY_PART2, sent.getPART2());
        values.put(KEY_PART3, sent.getPART3());
        values.put(KEY_RULE, sent.getRULE());
        // Inserting Row
        dbase.insert(TABLE_SENTENCE, null, values);
    }
    public ArrayList<Sentence> getAllSentences() {
        ArrayList<Sentence> sentList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_SENTENCE;
        dbase=this.getReadableDatabase();
        this.rowcount();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Sentence sent = new Sentence();
                sent.setID(cursor.getInt(0));
                sent.setANSWER(cursor.getString(1));
                sent.setPART1(cursor.getString(2));
                sent.setPART2(cursor.getString(3));
                sent.setPART3(cursor.getString(4));
                sent.setRULE(cursor.getString(5));
                sentList.add(sent);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return sentList;
    }
    public int rowcount()
    {
        int row;
        String selectQuery = "SELECT  * FROM " + TABLE_SENTENCE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        cursor.close();
        return row;
    }
}
