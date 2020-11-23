package com.mycompany.atividadeteste4;

public class Credito {
    
    public boolean concedeCredito(int parcelas, boolean confiavel, double salario) {
	if (parcelas > 12)
            return false;
        else 
            if (confiavel == false)
                return false;
            else
                if (salario < 5000)
                    return false;
                else
                    return true;
	}

	public double definirCredito(int parcelas, boolean confiavel, double salario) {
            if (concedeCredito(parcelas, confiavel, salario) == true)
                return 20000;
            else
                return 0;
	}

}
