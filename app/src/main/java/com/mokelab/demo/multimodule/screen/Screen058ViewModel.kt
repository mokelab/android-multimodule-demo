package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data571RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data572RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data573RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data574RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data575RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data576RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data577RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data578RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data579RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data580RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen058ViewModel @Inject constructor(
    private val repo1: Data571RepositoryImpl,
    private val repo2: Data572RepositoryImpl,
    private val repo3: Data573RepositoryImpl,
    private val repo4: Data574RepositoryImpl,
    private val repo5: Data575RepositoryImpl,
    private val repo6: Data576RepositoryImpl,
    private val repo7: Data577RepositoryImpl,
    private val repo8: Data578RepositoryImpl,
    private val repo9: Data579RepositoryImpl,
    private val repo10: Data580RepositoryImpl,

): ViewModel() {
}
