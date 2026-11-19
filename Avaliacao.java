void main() {
    int tempoEspera;
    int tempoTotal = 0;
    int clientes = 0;
    
    tempoEspera = Integer.parseInt (
        IO.readln("Informe o tempo de espera do cliente: ")
    );

    while (tempoEspera >= 0){

        tempoTotal = tempoTotal + tempoEspera;
        clientes = clientes + 1;

        tempoEspera = Integer.parseInt(
            IO.readln("Informe o tempo de espera do próximo cliente: ")
        );
    }

    if (clientes > 0) {
        
        double media =(double) tempoTotal / clientes;

        System.out.printf("Tempo total de espera é de %d minutos%n", tempoTotal);
        System.out.printf("Clientes registrados  %d%n", clientes);
        System.out.printf("Tempo médio de espera: %.2f minutos%n", media);

        if (media<=10) {
            IO.println("Classificação: Atendimento ágil");
        }
        else if (media <=20)  {
            IO.println("Classificação: Atendimento regular");
        }
        else {
            IO.println("Classificação: Atendimento lento: reforçar a equipe");
        }
    }
    
    else {
        IO.println("Nenhum cliente foi registrado.");
        IO.println("Não foi possível calculara a média.");
    }
}
