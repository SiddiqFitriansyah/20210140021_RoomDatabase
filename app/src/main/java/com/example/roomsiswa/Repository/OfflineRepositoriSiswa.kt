package com.example.roomsiswa.Repository

import com.example.roomsiswa.Data.Siswa
import com.example.roomsiswa.Data.SiswaDao
import java.util.concurrent.Flow


class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int): Flow<Siswa> = siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: Siswa) {

    }
}