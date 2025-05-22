import { Item } from "./item";
import { Cliente } from "./cliente";

export class Cesta {
    public codigo: number = 0;
    public cliente: Cliente = new Cliente();
    public total: number = 0;
    public itens: Item[] = [];
}
