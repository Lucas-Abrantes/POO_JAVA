package exemplos.natal;

public class DemoNatal {
    public static void main(String[] args) {
        DataNatal n2022 = DataNatal.natal(2022);
        DataNatal n2021 = DataNatal.natal(2021);
        DataNatal n2020 = DataNatal.natal(2020);
        n2022.exibeData();
        n2021.exibeData();
        n2020.exibeData();
    }
}
