package code;
import java.time.LocalDate;
public class BankAccount {
private int acountNo;
private String name;
private AcTyp type;
private String IFSC;
private LocalDate DOO;
public BankAccount(int acountNo, String name, AcTyp type, String iFSC, LocalDate dOO) {
	super();
	this.acountNo = acountNo;
	this.name = name;
	this.type = type;
	IFSC = iFSC;
	DOO = dOO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAcountNo() {
	return acountNo;
}
public AcTyp getType() {
	return type;
}
public String getIFSC() {
	return IFSC;
}
public LocalDate getDOO() {
	return DOO;
}
@Override
public String toString() {
	return "BankAccount [acountNo=" + acountNo + ", name=" + name +"  AccountType="+type+ ", IFSC=" + IFSC + ", DOO=" + DOO + "]";
}
public boolean equals(Object anotherAccount)
{
	if(anotherAccount instanceof BankAccount)
	{
		BankAccount B=(BankAccount)anotherAccount;
		return this.acountNo==(B.acountNo);
	}
	return false;
}
}

