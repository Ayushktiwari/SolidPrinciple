interface ISpellChecker {
    void check() ;
}

class Emailer{
    private ISpellChecker spellChecker;
    public Emailer(ISpellChecker sc) {
        this.spellChecker = sc;
    }
    public void checkEmail() {
        this.spellChecker.check();
    }
}

 class SpellChecker implements ISpellChecker {
    @Override
    public void check()  {
    }
}

 class GreekSpellChecker implements ISpellChecker {
    @Override
    public void check()  {
    }
}
class DependenctIP{
    public static void main(String[] a) {
        ISpellChecker defaultChecker = new SpellChecker();
        ISpellChecker greekChecker = new GreekSpellChecker();
        new Emailer(defaultChecker).checkEmail();
        new Emailer(greekChecker).checkEmail();
    }
}