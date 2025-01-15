

public class PasswordCracker {

	// Un oggetto di questa classe rappresenta un hacker che cerca di violare
	// la password segreta per aprire il file protetto che viene ricevuto nel
	// costruttore.

	private PasswordGenerator passwordGenerator;
	private PasswordProtectedFile fileToCrack;
	private int password_length;

	public PasswordCracker(PasswordProtectedFile file, int password_length) {
		this.password_length = password_length;
		this.passwordGenerator = new PasswordGenerator();
		this.fileToCrack = file;
	}

	public String crack_it() {
		// TODO: continua a generaqre password tramite un generatore
		// fino a quando non ottiene la corrispondenza con la password
		// del file. A questo punto ritorna la password al chiamante.

		boolean c = false;
		String password = null;

		while (c == false) {

			password = this.passwordGenerator.generate(this.password_length);

			if (this.fileToCrack.open(password)) {
				c = true;
			}
			
			

		}
		

		return password;

	}

}