// Student name: Jennifer Trac
// Student number: 300053014
// Course code: ITI1121
// Lab Section: A02

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int num) {
        numerator = num;
        denominator = 1;
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
        this.reduce();
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenomintor() {
        return this.denominator;
    }

    public Rational plus(Rational num) {
        return new Rational((this.getNumerator()*num.getDenomintor() + this.getDenomintor()*num.getNumerator()),(this.getDenomintor()*num.getDenomintor()));
    }

    public static Rational plus(Rational first, Rational second) {
        return new Rational((first.getNumerator()*second.getDenomintor() + first.getDenomintor()*second.getNumerator()),(first.getDenomintor()*second.getDenomintor()));
    }

    private static int gcd(int first, int second) {
        if (first>second) {
            for (int i=second; i>0; i--) {
                if (first%i == 0 && second%i ==0) {
                    return i;
                }
            }
        }
        else {
            for (int i=first; i>0; i--) {
                if (first%i == 0 && second%i == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    private void reduce() {
        for (int i=this.denominator; i>0; i--) {
            if (this.denominator%i==0 && this.numerator%i==0) {
                this.denominator = this.denominator/i;
                this.numerator = this.numerator/i;
            }
        }
    }

    public boolean equals(Rational o) {
        return(this.denominator==o.denominator && this.numerator==o.numerator);
    }

    public String toString() {
        if (this.denominator==1) {
            return String.valueOf(this.numerator);
        }
        return(this.numerator +"/"+ this.denominator);
    }

    public int compareTo( Rational o) {
        if (Double.valueOf(this.numerator)/this.denominator > Double.valueOf(o.numerator)/o.denominator) {
            return 1;
        }
        else if (Double.valueOf(this.numerator)/this.denominator < Double.valueOf(o.numerator)/o.denominator) {
            return -1;
        }
        return 0;
    }

}
