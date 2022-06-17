package quiz01;

public interface CompanyService {
    public void saveWorker(CompanyDTO dto);

    public void modify(CompanyDTO dto);

    public CompanyDTO search(String name);

    public void output();
}
