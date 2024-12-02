package Model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModelTabelKeranjang extends AbstractTableModel{
    private List<Keranjang> listKeranjang;
    private String[] columnNames ={"Id", "Nama Barang", "Total Barang", "Total Harga"};
    public ModelTabelKeranjang(List<Keranjang> listKeranjang){
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
        Keranjang keranjang = listKeranjang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return keranjang.getId_keranjang();
            case 1:
                return keranjang.getNama_barang();
            case 2:
                return keranjang.getTotal_barang();
            case 3:
                return keranjang.getTotal_harga();
            default:
                return null;
        }
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Keranjang row = listKeranjang.get(rowIndex);
        if(2 == columnIndex) {
            row.setTotal_barang(Integer.parseInt(String.valueOf(aValue)));
        }
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }



}
