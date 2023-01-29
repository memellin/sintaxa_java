package curso_prog;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;


public class Testes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Informe o número de funcionários: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o ID do funcionário: ");
            int id = scanner.nextInt();
            for (Funcionario f : funcionarios) {
                if (f.getId() == id) {
                    System.out.println("ID já existente, informe outro.");
                    i--;
                    continue;
                }
            }
            System.out.print("Informe o nome do funcionário: ");
            String nome = scanner.next();
            System.out.print("Informe o salário do funcionário: ");
            double salario = scanner.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Informe o ID do funcionário para aumento de salário: ");
        int id = scanner.nextInt();
        boolean idExiste = false;
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                idExiste = true;
                System.out.print("Informe o percentual de aumento: ");
                double percentual = scanner.nextDouble();
                f.aumentaSalario(percentual);
                break;
            }
        }
        if (!idExiste) {
            System.out.println("ID não encontrado, operação abortada.");
            scanner.close();
            return;
        }

        System.out.println("Listagem atualizada de funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        scanner.close();
    }
	
	/*public Integer hasId(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
	return null; funcao do professor
	}
	
	*/
	
	
	}
	

