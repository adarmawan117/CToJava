package ctojava;
public class Model {
    
    private final String[] listKey = {
        "#include",
        "int main", "void main",
        "printf",
        "return 0;"
    };
    
    public String checkKeyword(String keyword) {
        if(keyword.contains("#include")) {
            return "";
            
        } else if(keyword.contains("int main") || keyword.contains("void main")) {
            return keyword.
                    replace("int", "").
                    replace("void", "").
                    replace("()", "").
                    replace("main", "public static void main(String args[])");
            
        } else if(keyword.contains("printf")) {
            return keyword.replace("printf", "System.out.print");
            
        } else if(keyword.contains("return 0;")) {
            return "";
            
        } else {
            return keyword;
        }
    }
    
    /**
     * Fungsi yang akan menghapus karakter // dan spasi kosong<br>
     * Hasil dari fungsi ini akan digunakan untuk nama file.java dan namaClass
     * @param keyword Komentar yang akan diproses di baris pertama
     * @return mengembalikan file hasil penghapusan karakter // dan spasi kosong
     */
    public String extractHeader(String keyword) {
        return keyword.replace("//", "").replace(" ", "");
    }
}
