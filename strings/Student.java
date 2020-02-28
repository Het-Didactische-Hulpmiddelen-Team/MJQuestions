public class Student {

    // STRINGS ==============================================

    // Schrijf een functie "String repeat(String str, int n)" die een nieuwe string construeert
    // door n keer de string str te herhalen. Je mag ervan uitgaan dat n niet negatief is.
    //
    // E.g. repeat("abc", 3) returns "abcabcabc"

    public String repeat(String s, int n)
    {
        String r = "";
        for (int i = 0; i != n; ++i)
        {
            r += s;
        }
        return r;
    }

}