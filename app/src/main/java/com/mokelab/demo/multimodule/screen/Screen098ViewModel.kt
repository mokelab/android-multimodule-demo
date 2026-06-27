package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data971RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data972RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data973RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data974RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data975RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data976RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data977RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data978RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data979RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data980RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen098ViewModel @Inject constructor(
    private val repo1: Data971RepositoryImpl,
    private val repo2: Data972RepositoryImpl,
    private val repo3: Data973RepositoryImpl,
    private val repo4: Data974RepositoryImpl,
    private val repo5: Data975RepositoryImpl,
    private val repo6: Data976RepositoryImpl,
    private val repo7: Data977RepositoryImpl,
    private val repo8: Data978RepositoryImpl,
    private val repo9: Data979RepositoryImpl,
    private val repo10: Data980RepositoryImpl,

): ViewModel() {
}
