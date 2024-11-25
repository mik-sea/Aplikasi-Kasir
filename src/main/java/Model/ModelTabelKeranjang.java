package Model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModelTabelKeranjang extends AbstractTableModel{
    private List<KeranjangWithBarang> listKeranjang;
    private String[] columnNames ={"Nama Barang", "Harga", "Total Barang", "Total Harga"};
    public ModelTabelKeranjang(List<KeranjangWithBarang> listKeranjang){
        this.listKeranjang = listKeranjang;
    }

    public int getRowCount(){
        return listKeranjang.size();
    }

    public int getColumnCount(){
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KeranjangWithBarang keranjang = listKeranjang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return keranjang.getNamaBarang();
            case 1:
                return keranjang.getHarga();
            case 2:
                return keranjang.getTotal();
            case 3:
                return keranjang.getStatus();
            default:
                return null;
        }
    }



}
