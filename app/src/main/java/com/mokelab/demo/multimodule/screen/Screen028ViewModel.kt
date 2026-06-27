package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data271RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data272RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data273RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data274RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data275RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data276RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data277RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data278RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data279RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data280RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen028ViewModel @Inject constructor(
    private val repo1: Data271RepositoryImpl,
    private val repo2: Data272RepositoryImpl,
    private val repo3: Data273RepositoryImpl,
    private val repo4: Data274RepositoryImpl,
    private val repo5: Data275RepositoryImpl,
    private val repo6: Data276RepositoryImpl,
    private val repo7: Data277RepositoryImpl,
    private val repo8: Data278RepositoryImpl,
    private val repo9: Data279RepositoryImpl,
    private val repo10: Data280RepositoryImpl,

): ViewModel() {
}
