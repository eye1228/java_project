package com.ict07.IO;

public class Ex01 {
	//File Ŭ���� : Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
	/*
	������ : File(File parent, String child) , File(String pathname)
		   File(String parent, String child), File(URI uri)
		 **parent => �������, child => �������
		   parent + child == ��ü��� == pathname
		   uri => ��Ʈ��ũ �� �� ���
		   
		   
	�ֿ� �޼ҵ�
	-createNewFile() : boolean => ������ �����ϸ� true
					   			  ������ �������� ���ϸ� false(���� �̸��� ������ ���� ����)
	-mkdir(), mkdirs() : boolean => ���丮�� �����ϸ� true, ���ϸ� false
	���� �ΰ��� ������ : ������� �ϴ� ���丮�� ���� ���䰡 �������� ���� ��� ���� �Ұ� => mkdir();
	ex) c:|base|want => want ���丮�� ���鶧 base ���丮�� ���� ��� ���� �Ұ�
						���� ���丮�� base�� want ���丮���� ���������. => mkdirs();
						
	-delete() : ����, ���丮 ����
	-isDirectory() :���丮�̸� true
	-isFile()	 	�����̸� true
	**���� ���鿡�� ��ǻ�Ϳ��� ���ϰ� ���丮�� ����. �� ������ �ƴϸ� ���丮�̴�. ����丮�� �ƴϸ� �����̴�.,
	
	-**list() : ������ ��ġ�� ���� �� ���丮�� String[]�� ��´�.
	-length() : �迭�̳� String������ ����, ���Ͽ����� ������ ũ��.
	-getAbsolutePath() : ���� ��� ǥ��, ����� Ǯ����(���ۺ��� ������) => ���� == ��Ʈ
	-getPath() : ��� ��� ǥ�� , ���� ��ġ���� ���ϱ��� ���� �ϱ� ���� ���ľ� �Ǵ� ���
	-getCononicalPath() : ����ȭ ���
	-lastModified() : ������ ���� ��¥.	
	*/
}
