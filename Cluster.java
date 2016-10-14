package kmedoids;

import java.util.ArrayList;

public class Cluster {
	private String clusterName; // �����
	private Mediod medoid; // ��ص��ʵ�
	private ArrayList<DataPoint> dataPoints; // ����и�������

	public Cluster(String clusterName) {
		this.clusterName = clusterName;
		this.medoid = null; // will be set by calling setCentroid()
		dataPoints = new ArrayList<DataPoint>();
	}

	public void setMedoid(Mediod c) {
		medoid = c;
	}

	public Mediod getMedoid() {
		return medoid;
	}

	public void addDataPoint(DataPoint dp) { // called from CAInstance
		dp.setCluster(this);// ��ע���������ĳ��,����ŷʽ����
		this.dataPoints.add(dp);
	}

	public void removeDataPoint(DataPoint dp) {
		this.dataPoints.remove(dp);
	}

	public int getNumDataPoints() {
		return this.dataPoints.size();
	}

	public DataPoint getDataPoint(int pos) {
		return (DataPoint) this.dataPoints.get(pos);
	}

	public String getName() {
		return this.clusterName;
	}

	public ArrayList<DataPoint> getDataPoints() {
		return this.dataPoints;
	}
}