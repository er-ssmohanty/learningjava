class hero
{
    public static void main(String[] args)
    {
        Rank a=Rank.soldier;
        switch(a){
            case Soldier:
            System.out.println("Person is a soldier");
            break;

            case Sergent:
            System.out.println("Person is a sergent");
            break;

            case Captain:
            System.out.println("Person is a Captain");
            break;
        }
    }

}

enum Rank{
    Soldier,
    Sergent,
    Captain;
}