package db;

// Singleton aplicado. Somente uma instãncia do
// banco de dados será acessada em todo o programa
public class Database {

    private static Database db;

    private Database() {}

    public static Database getInstance() {
        if(db == null) {
            db = new Database();
        }
        return db;
    }
    
}
