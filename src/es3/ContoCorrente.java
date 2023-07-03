package es3;

public class ContoCorrente {
		String titolare;
		int nMovimenti;
		final int maxMovimenti = 50;
		double saldo;

		ContoCorrente(String titolare, double saldo) {
			this.titolare = titolare;
			this.saldo = saldo;
			nMovimenti = 0;
		}

		void preleva(double x) throws BancaException {
			if (nMovimenti < maxMovimenti)
				saldo = saldo - x;
			else
				saldo = saldo - x - 0.50;
			nMovimenti++;
		}

		double restituisciSaldo() throws BancaException {
			if (saldo < 0) {
				throw new BancaException("il conto è in rosso");
			}
			return saldo;
		}
}
//Creare un nuovo tipo di eccezione: la classe BancaException
//sottoclasse della classe Exception avente l’attributo message
//di tipo stringa. Scrivere il costruttore con un parametro di
//tipo stringa, dopo aver richiamato il costruttore della
//superclasse passando il parametro impostare il valore
//dell’attributo message uguale al parametro. Ridefinire il metodo toString che
//restituisce un stringa, il metodo restituisce il valore di message.
//
//Modificare il metodo preleva della classe ContoCorrente in modo che se saldo dopo
//la sottrazione è minore di zero il metodo lancia una eccezione di tipo BancaException
//istanziando l’eccezione con la stringa “il conto è in rosso” ed aumentando comunque il
//contatore dei movimenti.
//
//Modificare il metodo preleva della sottoclasse ContoOnLine in modo che se x>maxPreliev
//o viene lanciata una eccezione di tipo BancaException istanziando l’eccezione con la
//stringa “il prelievo non è disponibile”.
//
//Modificare la classe Banca in modo da catturare l’eccezione di tipo BancaException
//e stampare l’errore ogni volta che si richiama il metodo preleva